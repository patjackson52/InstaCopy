package io.jackson.instacopy;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://github.com/square/moshi/commit/924a2490beabc7fe511d75fe9ed34b743e9265e4
 */
public final class RuntimeJsonAdapterFactory implements JsonAdapter.Factory {
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap<>();
    private final Class<?> baseType;
    private final String labelKey;
    private Class<?> defaultType;

    public RuntimeJsonAdapterFactory(Class<?> baseType, String labelKey) {
        if (baseType == null) {
            throw new NullPointerException("baseType == null");
        }
        if (labelKey == null) {
            throw new NullPointerException("labelKey == null");
        }
        this.baseType = baseType;
        this.labelKey = labelKey;
    }

    public RuntimeJsonAdapterFactory registerDefaultType(Class<?> defaultType) {
        if (defaultType == null) {
            throw new NullPointerException("defaulttype == null");
        }
        if (!baseType.isAssignableFrom(defaultType)) {
            throw new IllegalArgumentException(defaultType + " must be a " + baseType);
        }
        this.defaultType = defaultType;
        return this;
    }

    public RuntimeJsonAdapterFactory registerSubtype(Class<?> subtype, String label) {
        if (subtype == null) {
            throw new NullPointerException("subtype == null");
        }
        if (label == null) {
            throw new NullPointerException("label == null");
        }
        if (!baseType.isAssignableFrom(subtype)) {
            throw new IllegalArgumentException(subtype + " must be a " + baseType);
        }
        subtypeToLabel.put(subtype, label);
        return this;
    }

    @Override
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        if (!annotations.isEmpty() || Types.getRawType(type) != baseType) {
            return null;
        }
        Map<Class<?>, String> subtypeToLabel = new LinkedHashMap<>(this.subtypeToLabel);
        int size = subtypeToLabel.size();
        Map<String, JsonAdapter<?>> labelToDelegate = new LinkedHashMap<>(size);
        Map<Class<?>, JsonAdapter<?>> subtypeToDelegate = new LinkedHashMap<>(size);
        for (Map.Entry<Class<?>, String> entry : subtypeToLabel.entrySet()) {
            Class<?> key = entry.getKey();
            String value = entry.getValue();
            JsonAdapter<?> delegate = moshi.adapter(key, annotations);
            labelToDelegate.put(value, delegate);
            subtypeToDelegate.put(key, delegate);
        }
        JsonAdapter<?> delegateDefault;
        if(defaultType != null) {
            delegateDefault = moshi.adapter(defaultType, annotations);
        } else {
            delegateDefault = null;
        }
        JsonAdapter<Map<String, Object>> toJsonDelegate =
                moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class));
        return new RuntimeJsonAdapter(labelKey, labelToDelegate, subtypeToDelegate, subtypeToLabel,
                toJsonDelegate, delegateDefault);
    }

    private static final class RuntimeJsonAdapter extends JsonAdapter<Object> {
        private final String labelKey;
        private final Map<String, JsonAdapter<?>> labelToDelegate;
        private final Map<Class<?>, JsonAdapter<?>> subtypeToDelegate;
        private final Map<Class<?>, String> subtypeToLabel;
        private final JsonAdapter<Map<String, Object>> toJsonDelegate;
        private final JsonAdapter<?> defaultDelegate;

        RuntimeJsonAdapter(String labelKey, Map<String, JsonAdapter<?>> labelToDelegate,
                           Map<Class<?>, JsonAdapter<?>> subtypeToDelegate, Map<Class<?>, String> subtypeToLabel,
                           JsonAdapter<Map<String, Object>> toJsonDelegate,
                           JsonAdapter<?> defaultDelegate) {
            this.labelKey = labelKey;
            this.labelToDelegate = labelToDelegate;
            this.subtypeToDelegate = subtypeToDelegate;
            this.subtypeToLabel = subtypeToLabel;
            this.toJsonDelegate = toJsonDelegate;
            this.defaultDelegate = defaultDelegate;
        }

        @Override
        public Object fromJson(JsonReader reader) throws IOException {
            Object raw = reader.readJsonValue();
            if (!(raw instanceof Map)) {
                throw new JsonDataException(
                        "Value must be a JSON object but had a value of " + raw + " of type " + raw.getClass());
            }
            @SuppressWarnings("unchecked") // This is a JSON object.
                    Map<String, Object> value = (Map<String, Object>) raw;
            if (value.isEmpty()) return null;
            Object label = value.remove(labelKey);
            if (label == null) {
                throw new JsonDataException("Missing label for " + labelKey + " in " + value.toString());
            }
            if (!(label instanceof String)) {
                throw new JsonDataException("Label for "
                        + labelKey
                        + " must be a string but had a value of "
                        + label
                        + " of type "
                        + label.getClass());
            }
            JsonAdapter<?> delegate = labelToDelegate.get(label);
            if (delegate == null) {
                if (defaultDelegate != null) {
                    System.err.println("using default delegate for label " + label + " value " + value.toString());
                    delegate = defaultDelegate;
                } else {
                    System.err.println("no fallback delegate found for label " + label + " value " + value.toString());
                    throw new JsonDataException("Type not registered for label: " + label);
                }
            }
            return delegate.fromJsonValue(value);
        }

        @Override
        public void toJson(JsonWriter writer, Object value) throws IOException {
            Class<?> subtype = value.getClass();
            @SuppressWarnings("unchecked") // The delegate is a JsonAdapter<subtype>.
                    JsonAdapter<Object> delegate = (JsonAdapter<Object>) subtypeToDelegate.get(subtype);
            if (delegate == null) {
                throw new JsonDataException("Type not registered: " + subtype);
            }
            @SuppressWarnings("unchecked") // This is a JSON object.
                    Map<String, Object> jsonValue = (Map<String, Object>) delegate.toJsonValue(value);
            Object existingLabel = jsonValue.put(labelKey, subtypeToLabel.get(subtype));
            if (existingLabel != null) {
                throw new JsonDataException(
                        "Label field " + labelKey + " already defined as " + existingLabel);
            }
            toJsonDelegate.toJson(writer, jsonValue);
        }
    }
}