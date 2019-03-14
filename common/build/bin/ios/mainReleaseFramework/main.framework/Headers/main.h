#import <Foundation/Foundation.h>

@class MainINIT, MainDispatcherFn, MainReduksContext, MainReduksCompanion, MainReduksInternalLogUtils, MainKotlinThrowable, MainSimpleStore, MainKotlinUnit, MainSimpleStoreCreator, MainSimpleStoreCompanion, MainStoreCreatorWithMiddlewares, MainKotlinArray, MainStoreEnhancerImpl, MainStoreSubscriberImpl, MainStoreSubscriberBuilderImpl, MainStoreSubscriberBuilderImpl2, MainSelectorBuilder, MainThunkImpl, MainOpt, MainInputField, MainAbstractSelector, MainSelectorForP5, MainSelectorForP4, MainSelectorForP3, MainSelectorForP2, MainSelectorForP1, MainActionWithContext, MainActionWithContextLambdaPattern, MainReduksContextCompanion, MainReduksContextTyped, MainActions, MainActionsFetchStoreInfoAction, MainActionsFetchStoreInfoSuccessAction, MainStoreInfoResponse, MainActionsFetchStoreInfoFailureAction, MainActionsFetchStoreFeedLoadingAction, MainActionsFetchStoreFeedSuccessAction, MainActionsFetchStoreFeedFailureAction, MainActionsAddToCartAction, MainActionsRemoveFromCartAction, MainActionsOpenQuantityPickerAction, MainAppState, MainCart, MainAppStateCompanion, MainPlatformLogger, MainLogger, MainNetworkThunks, MainKtorStoreRepository, MainPlatformDispatcher, MainKotlinx_coroutines_core_nativeCoroutineDispatcher, MainKotlinAbstractCoroutineContextElement, MainViewEffect, MainShowPickerViewEffect, MainStoreHeaderViewState, MainDeliveryOptionViewState, MainInfoCardViewState, MainFreeDeliveryCardViewState, MainStoreIcon, MainStoreIconCompanion, MainStoreIcon$serializer, MainItemViewState, MainItem, MainItemViewStateCompanion, MainItemCarouselViewState, MainListItemViewState, MainUI, MainGatewayResponse, MainGatewayResponseCompanion, MainGenericError, MainFeed, MainFeedCompanion, MainFeedHolder, MainFeedHolderSerializer, MainKotlinx_serialization_runtime_nativeSerialClassDescImpl, MainItemsResponse, MainItemsResponseCompanion, MainItemsResponse$serializer, MainDeliveryOptionsResponse, MainDeliveryOptionsResponseCompanion, MainDeliveryOptionsResponse$serializer, MainItemCompanion, MainItem$serializer, MainFreeDeliveryResponse, MainFreeDeliveryResponseCompanion, MainFreeDeliveryResponse$serializer, MainStoreInfoResponseCompanion, MainStoreInfoResponse$serializer, MainCouponResponse, MainCouponResponseCompanion, MainCouponResponse$serializer, MainNoResponse, MainViewEffectsMiddleware, MainKotlinException, MainKotlinx_serialization_runtime_nativeEnumDescriptor, MainKotlinx_serialization_runtime_nativeSerialKind, MainKotlinNothing, MainKotlinx_serialization_runtime_nativeUpdateMode, MainKotlinEnum;

@protocol MainAction, MainReduks, MainStore, MainStoreSubscription, MainSagaAction, MainStoreSubscriber, MainStoreCreator, MainStandardAction, MainStandardActionM, MainStoreEnhancer, MainStoreSubscriberBuilder, MainThunk, MainMemoizer, MainSelectorInput, MainSelector, MainActionWithContextPattern, MainKotlinx_coroutines_core_nativeCoroutineScope, MainKotlinCoroutineContext, MainKotlinCoroutineContextElement, MainKotlinCoroutineContextKey, MainKotlinContinuationInterceptor, MainKotlinContinuation, MainKotlinx_coroutines_core_nativeRunnable, MainKotlinx_serialization_runtime_nativeKSerializer, MainKotlinx_serialization_runtime_nativeGeneratedSerializer, MainKotlinx_serialization_runtime_nativeSerializationStrategy, MainKotlinx_serialization_runtime_nativeEncoder, MainKotlinx_serialization_runtime_nativeSerialDescriptor, MainKotlinx_serialization_runtime_nativeDeserializationStrategy, MainKotlinx_serialization_runtime_nativeDecoder, MainStoreRepository, MainKotlinIterator, MainKotlinx_serialization_runtime_nativeCompositeEncoder, MainKotlinx_serialization_runtime_nativeSerialContext, MainKotlinAnnotation, MainKotlinx_serialization_runtime_nativeCompositeDecoder, MainKotlinKClass, MainKotlinComparable, MainKotlinKDeclarationContainer, MainKotlinKAnnotatedElement, MainKotlinKClassifier;

NS_ASSUME_NONNULL_BEGIN

@interface KotlinBase : NSObject
- (instancetype)init __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
+ (void)initialize __attribute__((objc_requires_super));
@end;

@interface KotlinBase (KotlinBaseCopying) <NSCopying>
@end;

__attribute__((objc_runtime_name("KotlinMutableSet")))
__attribute__((swift_name("KotlinMutableSet")))
@interface MainMutableSet<ObjectType> : NSMutableSet<ObjectType>
@end;

__attribute__((objc_runtime_name("KotlinMutableDictionary")))
__attribute__((swift_name("KotlinMutableDictionary")))
@interface MainMutableDictionary<KeyType, ObjectType> : NSMutableDictionary<KeyType, ObjectType>
@end;

@interface NSError (NSErrorKotlinException)
@property (readonly) id _Nullable kotlinException;
@end;

__attribute__((objc_runtime_name("KotlinNumber")))
__attribute__((swift_name("KotlinNumber")))
@interface MainNumber : NSNumber
- (instancetype)initWithChar:(char)value __attribute__((unavailable));
- (instancetype)initWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
- (instancetype)initWithShort:(short)value __attribute__((unavailable));
- (instancetype)initWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
- (instancetype)initWithInt:(int)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
- (instancetype)initWithLong:(long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
- (instancetype)initWithLongLong:(long long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
- (instancetype)initWithFloat:(float)value __attribute__((unavailable));
- (instancetype)initWithDouble:(double)value __attribute__((unavailable));
- (instancetype)initWithBool:(BOOL)value __attribute__((unavailable));
- (instancetype)initWithInteger:(NSInteger)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
+ (instancetype)numberWithChar:(char)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
+ (instancetype)numberWithShort:(short)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
+ (instancetype)numberWithInt:(int)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
+ (instancetype)numberWithLong:(long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
+ (instancetype)numberWithLongLong:(long long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
+ (instancetype)numberWithFloat:(float)value __attribute__((unavailable));
+ (instancetype)numberWithDouble:(double)value __attribute__((unavailable));
+ (instancetype)numberWithBool:(BOOL)value __attribute__((unavailable));
+ (instancetype)numberWithInteger:(NSInteger)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
@end;

__attribute__((objc_runtime_name("KotlinByte")))
__attribute__((swift_name("KotlinByte")))
@interface MainByte : MainNumber
- (instancetype)initWithChar:(char)value;
+ (instancetype)numberWithChar:(char)value;
@end;

__attribute__((objc_runtime_name("KotlinUByte")))
__attribute__((swift_name("KotlinUByte")))
@interface MainUByte : MainNumber
- (instancetype)initWithUnsignedChar:(unsigned char)value;
+ (instancetype)numberWithUnsignedChar:(unsigned char)value;
@end;

__attribute__((objc_runtime_name("KotlinShort")))
__attribute__((swift_name("KotlinShort")))
@interface MainShort : MainNumber
- (instancetype)initWithShort:(short)value;
+ (instancetype)numberWithShort:(short)value;
@end;

__attribute__((objc_runtime_name("KotlinUShort")))
__attribute__((swift_name("KotlinUShort")))
@interface MainUShort : MainNumber
- (instancetype)initWithUnsignedShort:(unsigned short)value;
+ (instancetype)numberWithUnsignedShort:(unsigned short)value;
@end;

__attribute__((objc_runtime_name("KotlinInt")))
__attribute__((swift_name("KotlinInt")))
@interface MainInt : MainNumber
- (instancetype)initWithInt:(int)value;
+ (instancetype)numberWithInt:(int)value;
@end;

__attribute__((objc_runtime_name("KotlinUInt")))
__attribute__((swift_name("KotlinUInt")))
@interface MainUInt : MainNumber
- (instancetype)initWithUnsignedInt:(unsigned int)value;
+ (instancetype)numberWithUnsignedInt:(unsigned int)value;
@end;

__attribute__((objc_runtime_name("KotlinLong")))
__attribute__((swift_name("KotlinLong")))
@interface MainLong : MainNumber
- (instancetype)initWithLongLong:(long long)value;
+ (instancetype)numberWithLongLong:(long long)value;
@end;

__attribute__((objc_runtime_name("KotlinULong")))
__attribute__((swift_name("KotlinULong")))
@interface MainULong : MainNumber
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value;
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value;
@end;

__attribute__((objc_runtime_name("KotlinFloat")))
__attribute__((swift_name("KotlinFloat")))
@interface MainFloat : MainNumber
- (instancetype)initWithFloat:(float)value;
+ (instancetype)numberWithFloat:(float)value;
@end;

__attribute__((objc_runtime_name("KotlinDouble")))
__attribute__((swift_name("KotlinDouble")))
@interface MainDouble : MainNumber
- (instancetype)initWithDouble:(double)value;
+ (instancetype)numberWithDouble:(double)value;
@end;

__attribute__((objc_runtime_name("KotlinBoolean")))
__attribute__((swift_name("KotlinBoolean")))
@interface MainBoolean : MainNumber
- (instancetype)initWithBool:(BOOL)value;
+ (instancetype)numberWithBool:(BOOL)value;
@end;

__attribute__((swift_name("Action")))
@protocol MainAction
@required
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("INIT")))
@interface MainINIT : KotlinBase <MainAction>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DispatcherFn")))
@interface MainDispatcherFn : KotlinBase
- (instancetype)initWithFn:(id (^)(id))fn __attribute__((swift_name("init(fn:)"))) __attribute__((objc_designated_initializer));
- (id _Nullable)dispatchAction:(id)action __attribute__((swift_name("dispatch(action:)")));
- (id _Nullable)invokeAction:(id)action __attribute__((swift_name("invoke(action:)")));
@property (readonly) id (^ _Nullable fn_)(id);
@property (readonly) id (^ _Nullable fn)(id);
@end;

__attribute__((swift_name("Reduks")))
@protocol MainReduks
@required
@property (readonly) MainReduksContext *ctx;
@property (readonly) id<MainStore> store;
@property (readonly) MainMutableDictionary<NSString *, id<MainStoreSubscription>> *storeSubscriptionsByTag;
@property (readonly) MainMutableDictionary<NSString *, NSMutableArray<id<MainStoreSubscription>> *> *busStoreSubscriptionsByTag;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ReduksCompanion")))
@interface MainReduksCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (readonly) NSString *TagMainSubscription;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ReduksInternalLogUtils")))
@interface MainReduksInternalLogUtils : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)reduksInternalLogUtils __attribute__((swift_name("init()")));
- (void)reportErrorInReducerS:(id<MainStore>)s e:(MainKotlinThrowable *)e __attribute__((swift_name("reportErrorInReducer(s:e:)")));
- (void)reportErrorInSubscriberS:(id<MainStore>)s e:(MainKotlinThrowable *)e __attribute__((swift_name("reportErrorInSubscriber(s:e:)")));
@end;

__attribute__((swift_name("SagaAction")))
@protocol MainSagaAction
@required
@end;

__attribute__((swift_name("Store")))
@protocol MainStore
@required
- (id<MainStoreSubscription>)subscribeStoreSubscriber:(id<MainStoreSubscriber>)storeSubscriber __attribute__((swift_name("subscribe(storeSubscriber:)")));
- (void)replaceReducerReducer:(id _Nullable (^)(id _Nullable, id))reducer __attribute__((swift_name("replaceReducer(reducer:)")));
@property (readonly) id _Nullable state;
@property id (^dispatch)(id);
@property MainKotlinUnit *(^ _Nullable errorLogFn)(NSString *);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SimpleStore")))
@interface MainSimpleStore : KotlinBase <MainStore>
- (instancetype)initWithInitialState:(id _Nullable)initialState reducer:(id _Nullable (^)(id _Nullable, id))reducer __attribute__((swift_name("init(initialState:reducer:)"))) __attribute__((objc_designated_initializer));
@property id _Nullable state;
@end;

__attribute__((swift_name("StoreCreator")))
@protocol MainStoreCreator
@required
- (id<MainStore>)createReducer:(id _Nullable (^)(id _Nullable, id))reducer initialState:(id _Nullable)initialState __attribute__((swift_name("create(reducer:initialState:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SimpleStore.Creator")))
@interface MainSimpleStoreCreator : KotlinBase <MainStoreCreator>
- (instancetype)initWithWithStandardMiddlewares:(BOOL)withStandardMiddlewares __attribute__((swift_name("init(withStandardMiddlewares:)"))) __attribute__((objc_designated_initializer));
@property (readonly) BOOL withStandardMiddlewares;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SimpleStore.Companion")))
@interface MainSimpleStoreCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (readonly) NSString *redukstag;
@end;

__attribute__((swift_name("StandardAction")))
@protocol MainStandardAction <MainAction>
@required
@property (readonly) id _Nullable payload;
@property (readonly) BOOL error;
@end;

__attribute__((swift_name("StandardActionM")))
@protocol MainStandardActionM <MainStandardAction>
@required
@property (readonly) id _Nullable meta;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreCreatorWithMiddlewares")))
@interface MainStoreCreatorWithMiddlewares : KotlinBase <MainStoreCreator>
- (instancetype)initWithCreator:(id<MainStoreCreator>)creator middlewares_:(MainKotlinArray *)middlewares_ __attribute__((swift_name("init(creator:middlewares_:)"))) __attribute__((objc_designated_initializer));
@property (readonly) MainKotlinArray *middlewares;
@property (readonly) id<MainStoreCreator> creator;
@end;

__attribute__((swift_name("StoreEnhancer")))
@protocol MainStoreEnhancer
@required
- (id<MainStoreCreator>)enhanceNext:(id<MainStoreCreator>)next __attribute__((swift_name("enhance(next:)")));
@end;

__attribute__((swift_name("StoreSubscriber")))
@protocol MainStoreSubscriber
@required
- (void)onStateChange __attribute__((swift_name("onStateChange()")));
@end;

__attribute__((swift_name("StoreSubscriberBuilder")))
@protocol MainStoreSubscriberBuilder
@required
- (id<MainStoreSubscriber>)buildStore:(id<MainStore>)store __attribute__((swift_name("build(store:)")));
@end;

__attribute__((swift_name("StoreSubscription")))
@protocol MainStoreSubscription
@required
- (void)unsubscribe __attribute__((swift_name("unsubscribe()")));
@end;

__attribute__((swift_name("Thunk")))
@protocol MainThunk <MainAction>
@required
- (id)executeDispatcher:(id (^)(id))dispatcher state:(id _Nullable)state __attribute__((swift_name("execute(dispatcher:state:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreEnhancerImpl")))
@interface MainStoreEnhancerImpl : KotlinBase <MainStoreEnhancer>
- (instancetype)initWithStoreEnhancerFn:(id<MainStoreCreator> (^)(id<MainStoreCreator>))storeEnhancerFn __attribute__((swift_name("init(storeEnhancerFn:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id<MainStoreCreator> (^storeEnhancerFn)(id<MainStoreCreator>);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreSubscriberImpl")))
@interface MainStoreSubscriberImpl : KotlinBase <MainStoreSubscriber>
- (instancetype)initWithSubscriberFn:(MainKotlinUnit *(^)(void))subscriberFn __attribute__((swift_name("init(subscriberFn:)"))) __attribute__((objc_designated_initializer));
@property (readonly) MainKotlinUnit *(^subscriberFn)(void);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreSubscriberBuilderImpl")))
@interface MainStoreSubscriberBuilderImpl : KotlinBase <MainStoreSubscriberBuilder>
- (instancetype)initWithStoreSubscriberBuilderFn:(id<MainStoreSubscriber> (^)(id<MainStore>))storeSubscriberBuilderFn __attribute__((swift_name("init(storeSubscriberBuilderFn:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id<MainStoreSubscriber> (^storeSubscriberBuilderFn)(id<MainStore>);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreSubscriberBuilderImpl2")))
@interface MainStoreSubscriberBuilderImpl2 : KotlinBase <MainStoreSubscriberBuilder>
- (instancetype)initWithStoreSubscriberBuilderFn2:(id<MainStoreSubscriber> (^)(id<MainStore>, MainSelectorBuilder *))storeSubscriberBuilderFn2 __attribute__((swift_name("init(storeSubscriberBuilderFn2:)"))) __attribute__((objc_designated_initializer));
@property (readonly) MainSelectorBuilder *selector;
@property (readonly) id<MainStoreSubscriber> (^storeSubscriberBuilderFn2)(id<MainStore>, MainSelectorBuilder *);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ThunkImpl")))
@interface MainThunkImpl : KotlinBase <MainThunk>
- (instancetype)initWithThunkFn:(id (^)(id (^)(id), id _Nullable))thunkFn __attribute__((swift_name("init(thunkFn:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id (^thunkFn)(id (^)(id), id _Nullable);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Opt")))
@interface MainOpt : KotlinBase
- (instancetype)initWithIt:(id _Nullable)it __attribute__((swift_name("init(it:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id _Nullable it;
@end;

__attribute__((swift_name("Memoizer")))
@protocol MainMemoizer
@required
- (id _Nullable)memoizeState:(id)state inputs:(MainKotlinArray *)inputs __attribute__((swift_name("memoize(state:inputs:)")));
@end;

__attribute__((swift_name("SelectorInput")))
@protocol MainSelectorInput
@required
- (id _Nullable)invokeState:(id _Nullable)state __attribute__((swift_name("invoke(state:)")));
@property (readonly) MainBoolean *(^equalityCheck)(id, id);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InputField")))
@interface MainInputField : KotlinBase <MainSelectorInput>
- (instancetype)initWithFn:(id _Nullable (^)(id _Nullable))fn equalityCheck:(MainBoolean *(^)(id, id))equalityCheck __attribute__((swift_name("init(fn:equalityCheck:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id _Nullable (^fn)(id _Nullable);
@end;

__attribute__((swift_name("Selector")))
@protocol MainSelector <MainSelectorInput>
@required
- (BOOL)isChanged __attribute__((swift_name("isChanged()")));
- (void)signalChanged __attribute__((swift_name("signalChanged()")));
- (void)resetChanged __attribute__((swift_name("resetChanged()")));
- (id _Nullable)getIfChangedInState:(id _Nullable)state __attribute__((swift_name("getIfChangedIn(state:)")));
- (void)onChangeInState:(id _Nullable)state blockfn:(MainKotlinUnit *(^)(id _Nullable))blockfn __attribute__((swift_name("onChangeIn(state:blockfn:)")));
- (void)onChangeInState:(id _Nullable)state condition:(BOOL)condition blockfn:(MainKotlinUnit *(^)(id _Nullable))blockfn __attribute__((swift_name("onChangeIn(state:condition:blockfn:)")));
@property (readonly) int64_t recomputations;
@end;

__attribute__((swift_name("AbstractSelector")))
@interface MainAbstractSelector : KotlinBase <MainSelector>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@property int64_t recomputationsLastChanged;
@property int64_t _recomputations;
@property (readonly) id _Nullable (^computeAndCount)(MainKotlinArray *);
@property (readonly) id<MainMemoizer> memoizer;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SelectorForP5")))
@interface MainSelectorForP5 : KotlinBase
- (instancetype)initWithSi0:(id<MainSelectorInput>)si0 si1:(id<MainSelectorInput>)si1 si2:(id<MainSelectorInput>)si2 si3:(id<MainSelectorInput>)si3 si4:(id<MainSelectorInput>)si4 __attribute__((swift_name("init(si0:si1:si2:si3:si4:)"))) __attribute__((objc_designated_initializer));
- (MainAbstractSelector *)computeEqualityCheckForResult:(MainBoolean *(^)(id, id))equalityCheckForResult computeFun:(id _Nullable (^)(id, id, id, id, id))computeFun __attribute__((swift_name("compute(equalityCheckForResult:computeFun:)")));
@property (readonly) id<MainSelectorInput> si0;
@property (readonly) id<MainSelectorInput> si1;
@property (readonly) id<MainSelectorInput> si2;
@property (readonly) id<MainSelectorInput> si3;
@property (readonly) id<MainSelectorInput> si4;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SelectorForP4")))
@interface MainSelectorForP4 : KotlinBase
- (instancetype)initWithSi0:(id<MainSelectorInput>)si0 si1:(id<MainSelectorInput>)si1 si2:(id<MainSelectorInput>)si2 si3:(id<MainSelectorInput>)si3 __attribute__((swift_name("init(si0:si1:si2:si3:)"))) __attribute__((objc_designated_initializer));
- (MainSelectorForP5 *)withFieldFn:(id (^)(id))fn __attribute__((swift_name("withField(fn:)")));
- (MainSelectorForP5 *)withFieldByValueFn:(id (^)(id))fn __attribute__((swift_name("withFieldByValue(fn:)")));
- (MainSelectorForP5 *)withSelectorSi:(id<MainSelectorInput>)si __attribute__((swift_name("withSelector(si:)")));
- (MainAbstractSelector *)computeEqualityCheckForResult:(MainBoolean *(^)(id, id))equalityCheckForResult computeFun:(id _Nullable (^)(id, id, id, id))computeFun __attribute__((swift_name("compute(equalityCheckForResult:computeFun:)")));
@property (readonly) id<MainSelectorInput> si0;
@property (readonly) id<MainSelectorInput> si1;
@property (readonly) id<MainSelectorInput> si2;
@property (readonly) id<MainSelectorInput> si3;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SelectorForP3")))
@interface MainSelectorForP3 : KotlinBase
- (instancetype)initWithSi0:(id<MainSelectorInput>)si0 si1:(id<MainSelectorInput>)si1 si2:(id<MainSelectorInput>)si2 __attribute__((swift_name("init(si0:si1:si2:)"))) __attribute__((objc_designated_initializer));
- (MainSelectorForP4 *)withFieldFn:(id (^)(id))fn __attribute__((swift_name("withField(fn:)")));
- (MainSelectorForP4 *)withFieldByValueFn:(id (^)(id))fn __attribute__((swift_name("withFieldByValue(fn:)")));
- (MainSelectorForP4 *)withSelectorSi:(id<MainSelectorInput>)si __attribute__((swift_name("withSelector(si:)")));
- (MainAbstractSelector *)computeEqualityCheckForResult:(MainBoolean *(^)(id, id))equalityCheckForResult computeFun:(id _Nullable (^)(id, id, id))computeFun __attribute__((swift_name("compute(equalityCheckForResult:computeFun:)")));
@property (readonly) id<MainSelectorInput> si0;
@property (readonly) id<MainSelectorInput> si1;
@property (readonly) id<MainSelectorInput> si2;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SelectorForP2")))
@interface MainSelectorForP2 : KotlinBase
- (instancetype)initWithSi0:(id<MainSelectorInput>)si0 si1:(id<MainSelectorInput>)si1 __attribute__((swift_name("init(si0:si1:)"))) __attribute__((objc_designated_initializer));
- (MainSelectorForP3 *)withFieldFn:(id (^)(id))fn __attribute__((swift_name("withField(fn:)")));
- (MainSelectorForP3 *)withFieldByValueFn:(id (^)(id))fn __attribute__((swift_name("withFieldByValue(fn:)")));
- (MainSelectorForP3 *)withSelectorSi:(id<MainSelectorInput>)si __attribute__((swift_name("withSelector(si:)")));
- (MainAbstractSelector *)computeEqualityCheckForResult:(MainBoolean *(^)(id, id))equalityCheckForResult computeFun:(id _Nullable (^)(id, id))computeFun __attribute__((swift_name("compute(equalityCheckForResult:computeFun:)")));
@property (readonly) id<MainSelectorInput> si0;
@property (readonly) id<MainSelectorInput> si1;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SelectorForP1")))
@interface MainSelectorForP1 : KotlinBase
- (instancetype)initWithSi0:(id<MainSelectorInput>)si0 __attribute__((swift_name("init(si0:)"))) __attribute__((objc_designated_initializer));
- (MainSelectorForP2 *)withFieldFn:(id (^)(id))fn __attribute__((swift_name("withField(fn:)")));
- (MainSelectorForP2 *)withFieldByValueFn:(id (^)(id))fn __attribute__((swift_name("withFieldByValue(fn:)")));
- (MainSelectorForP2 *)withSelectorSi:(id<MainSelectorInput>)si __attribute__((swift_name("withSelector(si:)")));
- (MainAbstractSelector *)computeEqualityCheckForResult:(MainBoolean *(^)(id, id))equalityCheckForResult computeFun:(id _Nullable (^)(id))computeFun __attribute__((swift_name("compute(equalityCheckForResult:computeFun:)")));
@property (readonly) id<MainSelectorInput> si0;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SelectorBuilder")))
@interface MainSelectorBuilder : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (MainSelectorForP1 *)withFieldFn:(id (^)(id))fn __attribute__((swift_name("withField(fn:)")));
- (MainSelectorForP1 *)withFieldByValueFn:(id (^)(id))fn __attribute__((swift_name("withFieldByValue(fn:)")));
- (MainSelectorForP1 *)withSelectorSi:(id<MainSelectorInput>)si __attribute__((swift_name("withSelector(si:)")));
- (MainAbstractSelector *)withSingleFieldFn:(id (^)(id))fn __attribute__((swift_name("withSingleField(fn:)")));
- (MainAbstractSelector *)withSingleFieldByValueFn:(id (^)(id))fn __attribute__((swift_name("withSingleFieldByValue(fn:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ActionWithContext")))
@interface MainActionWithContext : KotlinBase <MainAction>
- (instancetype)initWithAction_:(id)action_ context_:(MainReduksContext *)context_ __attribute__((swift_name("init(action_:context_:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id action;
@property (readonly) MainReduksContext *context;
@end;

__attribute__((swift_name("ActionWithContextPattern")))
@protocol MainActionWithContextPattern
@required
- (BOOL)matchA:(MainActionWithContext *)a __attribute__((swift_name("match(a:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ActionWithContextLambdaPattern")))
@interface MainActionWithContextLambdaPattern : KotlinBase <MainActionWithContextPattern>
- (instancetype)initWithMatch_ctx:(MainReduksContext *)match_ctx matchfn:(MainBoolean *(^)(id))matchfn __attribute__((swift_name("init(match_ctx:matchfn:)"))) __attribute__((objc_designated_initializer));
@property (readonly) MainReduksContext *match_ctx;
@property (readonly) MainBoolean *(^matchfn)(id);
@end;

__attribute__((swift_name("ReduksContext")))
@interface MainReduksContext : KotlinBase
- (instancetype)initWithModuleId:(NSString *)moduleId modulePath:(NSArray<NSString *> * _Nullable)modulePath __attribute__((swift_name("init(moduleId:modulePath:)"))) __attribute__((objc_designated_initializer));
- (BOOL)isValid __attribute__((swift_name("isValid()")));
- (BOOL)hasEmptyPath __attribute__((swift_name("hasEmptyPath()")));
- (MainReduksContext *)joinedWithOther:(MainReduksContext *)other __attribute__((swift_name("joinedWith(other:)")));
- (MainReduksContext *)divOther:(MainReduksContext *)other __attribute__((swift_name("div(other:)")));
- (id)divAction:(id)action __attribute__((swift_name("div(action:)")));
@property (readonly) NSString *moduleId;
@property (readonly) NSArray<NSString *> * _Nullable modulePath;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ReduksContext.Companion")))
@interface MainReduksContextCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (MainReduksContext *)default __attribute__((swift_name("default()")));
- (MainReduksContextTyped *)defaultTyped __attribute__((swift_name("defaultTyped()")));
- (NSString *)defaultModuleId __attribute__((swift_name("defaultModuleId()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ReduksContextTyped")))
@interface MainReduksContextTyped : MainReduksContext
- (instancetype)initWithModuleId:(NSString *)moduleId modulePath:(NSArray<NSString *> * _Nullable)modulePath __attribute__((swift_name("init(moduleId:modulePath:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("Actions")))
@interface MainActions : KotlinBase <MainAction>
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.FetchStoreInfoAction")))
@interface MainActionsFetchStoreInfoAction : KotlinBase
- (instancetype)initWithStoreId:(NSString *)storeId __attribute__((swift_name("init(storeId:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (MainActionsFetchStoreInfoAction *)doCopyStoreId:(NSString *)storeId __attribute__((swift_name("doCopy(storeId:)")));
@property (readonly) NSString *storeId;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.FetchStoreInfoSuccessAction")))
@interface MainActionsFetchStoreInfoSuccessAction : KotlinBase
- (instancetype)initWithStoreInfoResponse:(MainStoreInfoResponse *)storeInfoResponse __attribute__((swift_name("init(storeInfoResponse:)"))) __attribute__((objc_designated_initializer));
- (MainStoreInfoResponse *)component1 __attribute__((swift_name("component1()")));
- (MainActionsFetchStoreInfoSuccessAction *)doCopyStoreInfoResponse:(MainStoreInfoResponse *)storeInfoResponse __attribute__((swift_name("doCopy(storeInfoResponse:)")));
@property (readonly) MainStoreInfoResponse *storeInfoResponse;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.FetchStoreInfoFailureAction")))
@interface MainActionsFetchStoreInfoFailureAction : KotlinBase
- (instancetype)initWithMessage:(NSString *)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (MainActionsFetchStoreInfoFailureAction *)doCopyMessage:(NSString *)message __attribute__((swift_name("doCopy(message:)")));
@property (readonly) NSString *message;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.FetchStoreFeedLoadingAction")))
@interface MainActionsFetchStoreFeedLoadingAction : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.FetchStoreFeedSuccessAction")))
@interface MainActionsFetchStoreFeedSuccessAction : KotlinBase
- (instancetype)initWithResponse:(NSDictionary<NSString *, id> *)response __attribute__((swift_name("init(response:)"))) __attribute__((objc_designated_initializer));
- (NSDictionary<NSString *, id> *)component1 __attribute__((swift_name("component1()")));
- (MainActionsFetchStoreFeedSuccessAction *)doCopyResponse:(NSDictionary<NSString *, id> *)response __attribute__((swift_name("doCopy(response:)")));
@property (readonly) NSDictionary<NSString *, id> *response;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.FetchStoreFeedFailureAction")))
@interface MainActionsFetchStoreFeedFailureAction : KotlinBase
- (instancetype)initWithMessage:(NSString *)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (MainActionsFetchStoreFeedFailureAction *)doCopyMessage:(NSString *)message __attribute__((swift_name("doCopy(message:)")));
@property (readonly) NSString *message;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.AddToCartAction")))
@interface MainActionsAddToCartAction : KotlinBase
- (instancetype)initWithItemId:(NSString *)itemId __attribute__((swift_name("init(itemId:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (MainActionsAddToCartAction *)doCopyItemId:(NSString *)itemId __attribute__((swift_name("doCopy(itemId:)")));
@property (readonly) NSString *itemId;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.RemoveFromCartAction")))
@interface MainActionsRemoveFromCartAction : KotlinBase
- (instancetype)initWithItemId:(NSString *)itemId __attribute__((swift_name("init(itemId:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (MainActionsRemoveFromCartAction *)doCopyItemId:(NSString *)itemId __attribute__((swift_name("doCopy(itemId:)")));
@property (readonly) NSString *itemId;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Actions.OpenQuantityPickerAction")))
@interface MainActionsOpenQuantityPickerAction : KotlinBase
- (instancetype)initWithItemId:(NSString *)itemId __attribute__((swift_name("init(itemId:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (MainActionsOpenQuantityPickerAction *)doCopyItemId:(NSString *)itemId __attribute__((swift_name("doCopy(itemId:)")));
@property (readonly) NSString *itemId;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AppState")))
@interface MainAppState : KotlinBase
- (instancetype)initWithListData:(NSArray<id> *)listData storeInfoResponse:(MainStoreInfoResponse *)storeInfoResponse loadingStoreInfo:(BOOL)loadingStoreInfo loadingStoreFeed:(BOOL)loadingStoreFeed cart:(MainCart *)cart __attribute__((swift_name("init(listData:storeInfoResponse:loadingStoreInfo:loadingStoreFeed:cart:)"))) __attribute__((objc_designated_initializer));
- (NSArray<id> *)component1 __attribute__((swift_name("component1()")));
- (MainStoreInfoResponse *)component2 __attribute__((swift_name("component2()")));
- (BOOL)component3 __attribute__((swift_name("component3()")));
- (BOOL)component4 __attribute__((swift_name("component4()")));
- (MainCart *)component5 __attribute__((swift_name("component5()")));
- (MainAppState *)doCopyListData:(NSArray<id> *)listData storeInfoResponse:(MainStoreInfoResponse *)storeInfoResponse loadingStoreInfo:(BOOL)loadingStoreInfo loadingStoreFeed:(BOOL)loadingStoreFeed cart:(MainCart *)cart __attribute__((swift_name("doCopy(listData:storeInfoResponse:loadingStoreInfo:loadingStoreFeed:cart:)")));
@property (readonly) NSArray<id> *listData;
@property (readonly) MainStoreInfoResponse *storeInfoResponse;
@property (readonly) BOOL loadingStoreInfo;
@property (readonly) BOOL loadingStoreFeed;
@property (readonly) MainCart *cart;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AppState.Companion")))
@interface MainAppStateCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (readonly) MainAppState *INITIAL_STATE;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Cart")))
@interface MainCart : KotlinBase
- (instancetype)initWithItems:(NSDictionary<NSString *, MainInt *> *)items __attribute__((swift_name("init(items:)"))) __attribute__((objc_designated_initializer));
- (BOOL)containsItemId:(NSString *)itemId __attribute__((swift_name("contains(itemId:)")));
- (int32_t)numInCartItemId:(NSString *)itemId __attribute__((swift_name("numInCart(itemId:)")));
- (int32_t)totalNumItems __attribute__((swift_name("totalNumItems()")));
- (NSDictionary<NSString *, MainInt *> *)component1 __attribute__((swift_name("component1()")));
- (MainCart *)doCopyItems:(NSDictionary<NSString *, MainInt *> *)items __attribute__((swift_name("doCopy(items:)")));
@property (readonly) NSDictionary<NSString *, MainInt *> *items;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PlatformLogger")))
@interface MainPlatformLogger : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)logDebugMsg:(NSString *)msg __attribute__((swift_name("logDebug(msg:)")));
- (void)logErrorMsg:(NSString *)msg __attribute__((swift_name("logError(msg:)")));
@property BOOL enabled;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Logger")))
@interface MainLogger : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)logger __attribute__((swift_name("init()")));
- (void)dMessage:(NSString *)message __attribute__((swift_name("d(message:)")));
- (void)eMessage:(NSString *)message exception:(MainKotlinThrowable * _Nullable)exception __attribute__((swift_name("e(message:exception:)")));
@property BOOL enabled;
@end;

__attribute__((swift_name("Kotlinx_coroutines_core_nativeCoroutineScope")))
@protocol MainKotlinx_coroutines_core_nativeCoroutineScope
@required
@property (readonly) id<MainKotlinCoroutineContext> coroutineContext;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NetworkThunks")))
@interface MainNetworkThunks : KotlinBase <MainKotlinx_coroutines_core_nativeCoroutineScope>
- (instancetype)initWithUiContext:(id<MainKotlinCoroutineContext>)uiContext __attribute__((swift_name("init(uiContext:)"))) __attribute__((objc_designated_initializer));
- (MainThunkImpl *)fetchStoreInfoAndFeedStoreId:(NSString *)storeId __attribute__((swift_name("fetchStoreInfoAndFeed(storeId:)")));
@property (readonly) MainKtorStoreRepository *repo;
@property (readonly) id<MainKotlinCoroutineContext> uiContext;
@end;

__attribute__((swift_name("KotlinCoroutineContext")))
@protocol MainKotlinCoroutineContext
@required
- (id _Nullable)foldInitial:(id _Nullable)initial operation:(id _Nullable (^)(id _Nullable, id<MainKotlinCoroutineContextElement>))operation __attribute__((swift_name("fold(initial:operation:)")));
- (id<MainKotlinCoroutineContextElement> _Nullable)getKey:(id<MainKotlinCoroutineContextKey>)key __attribute__((swift_name("get(key:)")));
- (id<MainKotlinCoroutineContext>)minusKeyKey:(id<MainKotlinCoroutineContextKey>)key __attribute__((swift_name("minusKey(key:)")));
- (id<MainKotlinCoroutineContext>)plusContext:(id<MainKotlinCoroutineContext>)context __attribute__((swift_name("plus(context:)")));
@end;

__attribute__((swift_name("KotlinCoroutineContextElement")))
@protocol MainKotlinCoroutineContextElement <MainKotlinCoroutineContext>
@required
@property (readonly) id<MainKotlinCoroutineContextKey> key;
@end;

__attribute__((swift_name("KotlinAbstractCoroutineContextElement")))
@interface MainKotlinAbstractCoroutineContextElement : KotlinBase <MainKotlinCoroutineContextElement>
- (instancetype)initWithKey:(id<MainKotlinCoroutineContextKey>)key __attribute__((swift_name("init(key:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("KotlinContinuationInterceptor")))
@protocol MainKotlinContinuationInterceptor <MainKotlinCoroutineContextElement>
@required
- (id<MainKotlinContinuation>)interceptContinuationContinuation:(id<MainKotlinContinuation>)continuation __attribute__((swift_name("interceptContinuation(continuation:)")));
- (void)releaseInterceptedContinuationContinuation:(id<MainKotlinContinuation>)continuation __attribute__((swift_name("releaseInterceptedContinuation(continuation:)")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_core_nativeCoroutineDispatcher")))
@interface MainKotlinx_coroutines_core_nativeCoroutineDispatcher : MainKotlinAbstractCoroutineContextElement <MainKotlinContinuationInterceptor>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithKey:(id<MainKotlinCoroutineContextKey>)key __attribute__((swift_name("init(key:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (void)dispatchContext:(id<MainKotlinCoroutineContext>)context block:(id<MainKotlinx_coroutines_core_nativeRunnable>)block __attribute__((swift_name("dispatch(context:block:)")));
- (void)dispatchYieldContext:(id<MainKotlinCoroutineContext>)context block:(id<MainKotlinx_coroutines_core_nativeRunnable>)block __attribute__((swift_name("dispatchYield(context:block:)")));
- (BOOL)isDispatchNeededContext:(id<MainKotlinCoroutineContext>)context __attribute__((swift_name("isDispatchNeeded(context:)")));
- (MainKotlinx_coroutines_core_nativeCoroutineDispatcher *)plusOther:(MainKotlinx_coroutines_core_nativeCoroutineDispatcher *)other __attribute__((swift_name("plus(other:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PlatformDispatcher")))
@interface MainPlatformDispatcher : MainKotlinx_coroutines_core_nativeCoroutineDispatcher
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)platformDispatcher __attribute__((swift_name("init()")));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
@end;

__attribute__((swift_name("ViewEffect")))
@interface MainViewEffect : KotlinBase
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ShowPickerViewEffect")))
@interface MainShowPickerViewEffect : MainViewEffect
- (instancetype)initWithItemId:(NSString *)itemId __attribute__((swift_name("init(itemId:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (MainShowPickerViewEffect *)doCopyItemId:(NSString *)itemId __attribute__((swift_name("doCopy(itemId:)")));
@property (readonly) NSString *itemId;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreHeaderViewState")))
@interface MainStoreHeaderViewState : KotlinBase
- (instancetype)initWithTitle:(NSString *)title subTitle:(NSString *)subTitle imageUrl:(NSString *)imageUrl bckgrndImageUrl:(NSString *)bckgrndImageUrl withInTime:(NSString *)withInTime moreInfoString:(NSString *)moreInfoString searchText:(NSString *)searchText __attribute__((swift_name("init(title:subTitle:imageUrl:bckgrndImageUrl:withInTime:moreInfoString:searchText:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (NSString *)component3 __attribute__((swift_name("component3()")));
- (NSString *)component4 __attribute__((swift_name("component4()")));
- (NSString *)component5 __attribute__((swift_name("component5()")));
- (NSString *)component6 __attribute__((swift_name("component6()")));
- (NSString *)component7 __attribute__((swift_name("component7()")));
- (MainStoreHeaderViewState *)doCopyTitle:(NSString *)title subTitle:(NSString *)subTitle imageUrl:(NSString *)imageUrl bckgrndImageUrl:(NSString *)bckgrndImageUrl withInTime:(NSString *)withInTime moreInfoString:(NSString *)moreInfoString searchText:(NSString *)searchText __attribute__((swift_name("doCopy(title:subTitle:imageUrl:bckgrndImageUrl:withInTime:moreInfoString:searchText:)")));
@property (readonly) NSString *title;
@property (readonly) NSString *subTitle;
@property (readonly) NSString *imageUrl;
@property (readonly) NSString *bckgrndImageUrl;
@property (readonly) NSString *withInTime;
@property (readonly) NSString *moreInfoString;
@property (readonly) NSString *searchText;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DeliveryOptionViewState")))
@interface MainDeliveryOptionViewState : KotlinBase
- (instancetype)initWithAddress:(NSString *)address time:(NSString *)time __attribute__((swift_name("init(address:time:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (MainDeliveryOptionViewState *)doCopyAddress:(NSString *)address time:(NSString *)time __attribute__((swift_name("doCopy(address:time:)")));
@property (readonly) NSString *address;
@property (readonly) NSString *time;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InfoCardViewState")))
@interface MainInfoCardViewState : KotlinBase
- (instancetype)initWithBckgrndImageUrl:(NSString *)bckgrndImageUrl infoIconImageUrl:(NSString *)infoIconImageUrl title:(NSString *)title tintColor:(int32_t)tintColor subTitle:(NSString *)subTitle __attribute__((swift_name("init(bckgrndImageUrl:infoIconImageUrl:title:tintColor:subTitle:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (NSString *)component3 __attribute__((swift_name("component3()")));
- (int32_t)component4 __attribute__((swift_name("component4()")));
- (NSString *)component5 __attribute__((swift_name("component5()")));
- (MainInfoCardViewState *)doCopyBckgrndImageUrl:(NSString *)bckgrndImageUrl infoIconImageUrl:(NSString *)infoIconImageUrl title:(NSString *)title tintColor:(int32_t)tintColor subTitle:(NSString *)subTitle __attribute__((swift_name("doCopy(bckgrndImageUrl:infoIconImageUrl:title:tintColor:subTitle:)")));
@property (readonly) NSString *bckgrndImageUrl;
@property (readonly) NSString *infoIconImageUrl;
@property (readonly) NSString *title;
@property (readonly) int32_t tintColor;
@property (readonly) NSString *subTitle;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FreeDeliveryCardViewState")))
@interface MainFreeDeliveryCardViewState : KotlinBase
- (instancetype)initWithBckgrndImageUrl:(NSString *)bckgrndImageUrl title:(NSString *)title subTitle:(NSString *)subTitle storeIcons:(NSArray<MainStoreIcon *> *)storeIcons __attribute__((swift_name("init(bckgrndImageUrl:title:subTitle:storeIcons:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (NSString *)component3 __attribute__((swift_name("component3()")));
- (NSArray<MainStoreIcon *> *)component4 __attribute__((swift_name("component4()")));
- (MainFreeDeliveryCardViewState *)doCopyBckgrndImageUrl:(NSString *)bckgrndImageUrl title:(NSString *)title subTitle:(NSString *)subTitle storeIcons:(NSArray<MainStoreIcon *> *)storeIcons __attribute__((swift_name("doCopy(bckgrndImageUrl:title:subTitle:storeIcons:)")));
@property (readonly) NSString *bckgrndImageUrl;
@property (readonly) NSString *title;
@property (readonly) NSString *subTitle;
@property (readonly) NSArray<MainStoreIcon *> *storeIcons;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreIcon")))
@interface MainStoreIcon : KotlinBase
- (instancetype)initWithIconUrl:(NSString *)iconUrl name:(NSString *)name __attribute__((swift_name("init(iconUrl:name:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (MainStoreIcon *)doCopyIconUrl:(NSString *)iconUrl name:(NSString *)name __attribute__((swift_name("doCopy(iconUrl:name:)")));
@property (readonly) NSString *iconUrl;
@property (readonly) NSString *name;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreIcon.Companion")))
@interface MainStoreIconCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<MainKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerializationStrategy")))
@protocol MainKotlinx_serialization_runtime_nativeSerializationStrategy
@required
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(id _Nullable)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@property (readonly) id<MainKotlinx_serialization_runtime_nativeSerialDescriptor> descriptor;
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeDeserializationStrategy")))
@protocol MainKotlinx_serialization_runtime_nativeDeserializationStrategy
@required
- (id _Nullable)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (id _Nullable)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(id _Nullable)old __attribute__((swift_name("patch(decoder:old:)")));
@property (readonly) id<MainKotlinx_serialization_runtime_nativeSerialDescriptor> descriptor;
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeKSerializer")))
@protocol MainKotlinx_serialization_runtime_nativeKSerializer <MainKotlinx_serialization_runtime_nativeSerializationStrategy, MainKotlinx_serialization_runtime_nativeDeserializationStrategy>
@required
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeGeneratedSerializer")))
@protocol MainKotlinx_serialization_runtime_nativeGeneratedSerializer <MainKotlinx_serialization_runtime_nativeKSerializer>
@required
- (MainKotlinArray *)childSerializers __attribute__((swift_name("childSerializers()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreIcon.$serializer")))
@interface MainStoreIcon$serializer : KotlinBase <MainKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (MainStoreIcon *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (MainStoreIcon *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainStoreIcon *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(MainStoreIcon *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ItemViewState")))
@interface MainItemViewState : KotlinBase
- (instancetype)initWithNumInCart:(int32_t)numInCart item:(MainItem *)item __attribute__((swift_name("init(numInCart:item:)"))) __attribute__((objc_designated_initializer));
- (int32_t)component1 __attribute__((swift_name("component1()")));
- (MainItem *)component2 __attribute__((swift_name("component2()")));
- (MainItemViewState *)doCopyNumInCart:(int32_t)numInCart item:(MainItem *)item __attribute__((swift_name("doCopy(numInCart:item:)")));
@property (readonly) int32_t numInCart;
@property (readonly) MainItem *item;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ItemViewState.Companion")))
@interface MainItemViewStateCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (readonly) MainItemViewState *PLACE_HOLDER;
@end;

__attribute__((swift_name("ListItemViewState")))
@interface MainListItemViewState : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (BOOL)areContentsTheSameOther:(id)other __attribute__((swift_name("areContentsTheSame(other:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ItemCarouselViewState")))
@interface MainItemCarouselViewState : MainListItemViewState
- (instancetype)initWithTitle:(NSString *)title items:(NSArray<MainItemViewState *> *)items __attribute__((swift_name("init(title:items:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSArray<MainItemViewState *> *)component2 __attribute__((swift_name("component2()")));
- (MainItemCarouselViewState *)doCopyTitle:(NSString *)title items:(NSArray<MainItemViewState *> *)items __attribute__((swift_name("doCopy(title:items:)")));
@property (readonly) NSString *title;
@property (readonly) NSArray<MainItemViewState *> *items;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("UI")))
@interface MainUI : MainKotlinx_coroutines_core_nativeCoroutineDispatcher
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("GatewayResponse")))
@interface MainGatewayResponse : KotlinBase
- (instancetype)initWithResponse:(id _Nullable)response __attribute__((swift_name("init(response:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithResponse:(id _Nullable)response status:(int32_t)status message:(NSString *)message __attribute__((swift_name("init(response:status:message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithStatus:(int32_t)status errorResponse:(id _Nullable)errorResponse message:(NSString *)message __attribute__((swift_name("init(status:errorResponse:message:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id _Nullable response;
@property (readonly) id _Nullable errorResponse;
@property (readonly) int32_t status;
@property (readonly) NSString * _Nullable message;
@property (readonly) BOOL isSuccessful;
@property (readonly) BOOL isFailure;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("GatewayResponse.Companion")))
@interface MainGatewayResponseCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (MainGatewayResponse *)createSuccessResponse:(id _Nullable)response status:(int32_t)status message:(NSString *)message __attribute__((swift_name("createSuccess(response:status:message:)")));
- (MainGatewayResponse *)createErrorError:(id _Nullable)error status:(int32_t)status message:(NSString *)message __attribute__((swift_name("createError(error:status:message:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("GenericError")))
@interface MainGenericError : KotlinBase
- (instancetype)initWithMessage:(NSString *)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (MainGenericError *)doCopyMessage:(NSString *)message __attribute__((swift_name("doCopy(message:)")));
@property (readonly) NSString *message;
@end;

__attribute__((swift_name("StoreRepository")))
@protocol MainStoreRepository
@required
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KtorStoreRepository")))
@interface MainKtorStoreRepository : KotlinBase <MainStoreRepository>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Feed")))
@interface MainFeed : KotlinBase
- (instancetype)initWithItems:(NSDictionary<NSString *, id> *)items __attribute__((swift_name("init(items:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSDictionary<NSString *, id> *items;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Feed.Companion")))
@interface MainFeedCompanion : KotlinBase <MainKotlinx_serialization_runtime_nativeKSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)output obj:(MainFeed *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
- (MainFeed *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)input __attribute__((swift_name("deserialize(decoder:)")));
- (MainFeed *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainFeed *)old __attribute__((swift_name("patch(decoder:old:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FeedHolder")))
@interface MainFeedHolder : KotlinBase
- (instancetype)initWithType:(NSString *)type data:(id)data __attribute__((swift_name("init(type:data:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *type;
@property (readonly) id data;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FeedHolderSerializer")))
@interface MainFeedHolderSerializer : KotlinBase <MainKotlinx_serialization_runtime_nativeKSerializer>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (MainFeedHolder *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)input __attribute__((swift_name("deserialize(decoder:)")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(MainFeedHolder *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
- (MainFeedHolder *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainFeedHolder *)old __attribute__((swift_name("patch(decoder:old:)")));
@property (readonly) MainKotlinx_serialization_runtime_nativeSerialClassDescImpl *descriptor;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ItemsResponse")))
@interface MainItemsResponse : KotlinBase
- (instancetype)initWithTitle:(NSString *)title items:(NSArray<MainItem *> *)items __attribute__((swift_name("init(title:items:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSArray<MainItem *> *)component2 __attribute__((swift_name("component2()")));
- (MainItemsResponse *)doCopyTitle:(NSString *)title items:(NSArray<MainItem *> *)items __attribute__((swift_name("doCopy(title:items:)")));
@property (readonly) NSString *title;
@property (readonly) NSArray<MainItem *> *items;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ItemsResponse.Companion")))
@interface MainItemsResponseCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<MainKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ItemsResponse.$serializer")))
@interface MainItemsResponse$serializer : KotlinBase <MainKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (MainItemsResponse *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (MainItemsResponse *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainItemsResponse *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(MainItemsResponse *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DeliveryOptionsResponse")))
@interface MainDeliveryOptionsResponse : KotlinBase
- (instancetype)initWithAddress:(NSString *)address time:(NSString *)time __attribute__((swift_name("init(address:time:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (MainDeliveryOptionsResponse *)doCopyAddress:(NSString *)address time:(NSString *)time __attribute__((swift_name("doCopy(address:time:)")));
@property (readonly) NSString *address;
@property (readonly) NSString *time;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DeliveryOptionsResponse.Companion")))
@interface MainDeliveryOptionsResponseCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<MainKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DeliveryOptionsResponse.$serializer")))
@interface MainDeliveryOptionsResponse$serializer : KotlinBase <MainKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (MainDeliveryOptionsResponse *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (MainDeliveryOptionsResponse *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainDeliveryOptionsResponse *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(MainDeliveryOptionsResponse *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Item")))
@interface MainItem : KotlinBase
- (instancetype)initWithImageUrl:(NSString *)imageUrl discountPrice:(NSString * _Nullable)discountPrice priceOrg:(NSString *)priceOrg discount:(NSString * _Nullable)discount name:(NSString *)name quantity:(NSString *)quantity id:(NSString *)id __attribute__((swift_name("init(imageUrl:discountPrice:priceOrg:discount:name:quantity:id:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString * _Nullable)component2 __attribute__((swift_name("component2()")));
- (NSString *)component3 __attribute__((swift_name("component3()")));
- (NSString * _Nullable)component4 __attribute__((swift_name("component4()")));
- (NSString *)component5 __attribute__((swift_name("component5()")));
- (NSString *)component6 __attribute__((swift_name("component6()")));
- (NSString *)component7 __attribute__((swift_name("component7()")));
- (MainItem *)doCopyImageUrl:(NSString *)imageUrl discountPrice:(NSString * _Nullable)discountPrice priceOrg:(NSString *)priceOrg discount:(NSString * _Nullable)discount name:(NSString *)name quantity:(NSString *)quantity id:(NSString *)id __attribute__((swift_name("doCopy(imageUrl:discountPrice:priceOrg:discount:name:quantity:id:)")));
@property (readonly) NSString *imageUrl;
@property (readonly) NSString * _Nullable discountPrice;
@property (readonly) NSString *priceOrg;
@property (readonly) NSString * _Nullable discount;
@property (readonly) NSString *name;
@property (readonly) NSString *quantity;
@property (readonly) NSString *id;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Item.Companion")))
@interface MainItemCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<MainKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@property (readonly) NSString *PLACE_HOLDER_ID;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Item.$serializer")))
@interface MainItem$serializer : KotlinBase <MainKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (MainItem *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (MainItem *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainItem *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(MainItem *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FreeDeliveryResponse")))
@interface MainFreeDeliveryResponse : KotlinBase
- (instancetype)initWithTitle:(NSString *)title subTitle:(NSString *)subTitle bckgndImageUrl:(NSString *)bckgndImageUrl storeIcons:(NSArray<MainStoreIcon *> *)storeIcons __attribute__((swift_name("init(title:subTitle:bckgndImageUrl:storeIcons:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (NSString *)component3 __attribute__((swift_name("component3()")));
- (NSArray<MainStoreIcon *> *)component4 __attribute__((swift_name("component4()")));
- (MainFreeDeliveryResponse *)doCopyTitle:(NSString *)title subTitle:(NSString *)subTitle bckgndImageUrl:(NSString *)bckgndImageUrl storeIcons:(NSArray<MainStoreIcon *> *)storeIcons __attribute__((swift_name("doCopy(title:subTitle:bckgndImageUrl:storeIcons:)")));
@property (readonly) NSString *title;
@property (readonly) NSString *subTitle;
@property (readonly) NSString *bckgndImageUrl;
@property (readonly) NSArray<MainStoreIcon *> *storeIcons;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FreeDeliveryResponse.Companion")))
@interface MainFreeDeliveryResponseCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<MainKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FreeDeliveryResponse.$serializer")))
@interface MainFreeDeliveryResponse$serializer : KotlinBase <MainKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (MainFreeDeliveryResponse *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (MainFreeDeliveryResponse *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainFreeDeliveryResponse *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(MainFreeDeliveryResponse *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreInfoResponse")))
@interface MainStoreInfoResponse : KotlinBase
- (instancetype)initWithTitle:(NSString *)title subTitle:(NSString *)subTitle imageUrl:(NSString *)imageUrl bckgndImageUrl:(NSString *)bckgndImageUrl withInTime:(NSString *)withInTime moreInfoString:(NSString *)moreInfoString searchText:(NSString *)searchText __attribute__((swift_name("init(title:subTitle:imageUrl:bckgndImageUrl:withInTime:moreInfoString:searchText:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (NSString *)component3 __attribute__((swift_name("component3()")));
- (NSString *)component4 __attribute__((swift_name("component4()")));
- (NSString *)component5 __attribute__((swift_name("component5()")));
- (NSString *)component6 __attribute__((swift_name("component6()")));
- (NSString *)component7 __attribute__((swift_name("component7()")));
- (MainStoreInfoResponse *)doCopyTitle:(NSString *)title subTitle:(NSString *)subTitle imageUrl:(NSString *)imageUrl bckgndImageUrl:(NSString *)bckgndImageUrl withInTime:(NSString *)withInTime moreInfoString:(NSString *)moreInfoString searchText:(NSString *)searchText __attribute__((swift_name("doCopy(title:subTitle:imageUrl:bckgndImageUrl:withInTime:moreInfoString:searchText:)")));
@property (readonly) NSString *title;
@property (readonly) NSString *subTitle;
@property (readonly) NSString *imageUrl;
@property (readonly) NSString *bckgndImageUrl;
@property (readonly) NSString *withInTime;
@property (readonly) NSString *moreInfoString;
@property (readonly) NSString *searchText;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreInfoResponse.Companion")))
@interface MainStoreInfoResponseCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<MainKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@property (readonly) MainStoreInfoResponse *LOADING;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreInfoResponse.$serializer")))
@interface MainStoreInfoResponse$serializer : KotlinBase <MainKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (MainStoreInfoResponse *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (MainStoreInfoResponse *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainStoreInfoResponse *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(MainStoreInfoResponse *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CouponResponse")))
@interface MainCouponResponse : KotlinBase
- (instancetype)initWithTitle:(NSString *)title subTitle:(NSString *)subTitle bckgndImageUrl:(NSString *)bckgndImageUrl infoIconImageUrl:(NSString *)infoIconImageUrl __attribute__((swift_name("init(title:subTitle:bckgndImageUrl:infoIconImageUrl:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (NSString *)component3 __attribute__((swift_name("component3()")));
- (NSString *)component4 __attribute__((swift_name("component4()")));
- (MainCouponResponse *)doCopyTitle:(NSString *)title subTitle:(NSString *)subTitle bckgndImageUrl:(NSString *)bckgndImageUrl infoIconImageUrl:(NSString *)infoIconImageUrl __attribute__((swift_name("doCopy(title:subTitle:bckgndImageUrl:infoIconImageUrl:)")));
@property (readonly) NSString *title;
@property (readonly) NSString *subTitle;
@property (readonly) NSString *bckgndImageUrl;
@property (readonly) NSString *infoIconImageUrl;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CouponResponse.Companion")))
@interface MainCouponResponseCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<MainKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CouponResponse.$serializer")))
@interface MainCouponResponse$serializer : KotlinBase <MainKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (MainCouponResponse *)deserializeDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (MainCouponResponse *)patchDecoder:(id<MainKotlinx_serialization_runtime_nativeDecoder>)decoder old:(MainCouponResponse *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<MainKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(MainCouponResponse *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NoResponse")))
@interface MainNoResponse : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewEffectsMiddleware")))
@interface MainViewEffectsMiddleware : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)viewEffectsMiddleware __attribute__((swift_name("init()")));
- (void)subscribeToViewEffectsSubscriber:(MainKotlinUnit *(^)(MainViewEffect *))subscriber __attribute__((swift_name("subscribeToViewEffects(subscriber:)")));
- (void)unsubscribeSubscriber:(MainKotlinUnit *(^)(MainViewEffect *))subscriber __attribute__((swift_name("unsubscribe(subscriber:)")));
- (id)dispatchStore:(id<MainStore>)store nextDispatcher:(id (^)(id))nextDispatcher action:(id)action __attribute__((swift_name("dispatch(store:nextDispatcher:action:)")));
@end;

@interface MainReduksContext (Extensions)
- (MainActionWithContextLambdaPattern *)matchAMatchfn:(MainBoolean *(^)(id))matchfn __attribute__((swift_name("matchA(matchfn:)")));
- (MainActionWithContextLambdaPattern *)isA __attribute__((swift_name("isA()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinArray")))
@interface MainKotlinArray : KotlinBase
+ (instancetype)arrayWithSize:(int32_t)size init:(id _Nullable (^)(MainInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (id _Nullable)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (id<MainKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(id _Nullable)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size;
@end;

@interface MainKotlinArray (Extensions)
- (id<MainStoreEnhancer>)toEnhancer __attribute__((swift_name("toEnhancer()")));
@end;

@interface MainCouponResponse (Extensions)
- (MainInfoCardViewState *)toViewStateColorRes:(int32_t)colorRes __attribute__((swift_name("toViewState(colorRes:)")));
@end;

@interface MainDeliveryOptionsResponse (Extensions)
- (MainDeliveryOptionViewState *)toViewState __attribute__((swift_name("toViewState()")));
@end;

@interface MainFreeDeliveryResponse (Extensions)
- (MainFreeDeliveryCardViewState *)toViewState __attribute__((swift_name("toViewState()")));
@end;

@interface MainStoreInfoResponse (Extensions)
- (MainStoreHeaderViewState *)toViewState __attribute__((swift_name("toViewState()")));
@end;

@interface MainItemsResponse (Extensions)
- (MainItemCarouselViewState *)toViewStateCart:(MainCart *)cart __attribute__((swift_name("toViewState(cart:)")));
@end;

@interface MainNoResponse (Extensions)
- (MainItemCarouselViewState *)toViewState __attribute__((swift_name("toViewState()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ReduksKt")))
@interface MainReduksKt : KotlinBase
+ (id _Nullable)state:(id<MainReduks>)receiver __attribute__((swift_name("state(_:)")));
+ (id)dispatch:(id<MainReduks>)receiver action:(id)action __attribute__((swift_name("dispatch(_:action:)")));
+ (void)subscribe:(id<MainReduks>)receiver subscriptionTag:(NSString *)subscriptionTag storeSubscriber:(id<MainStoreSubscriber>)storeSubscriber __attribute__((swift_name("subscribe(_:subscriptionTag:storeSubscriber:)")));
+ (void)subscribe:(id<MainReduks>)receiver subscriptionTag:(NSString *)subscriptionTag storeSubscriberBuilder:(id<MainStoreSubscriberBuilder>)storeSubscriberBuilder __attribute__((swift_name("subscribe(_:subscriptionTag:storeSubscriberBuilder:)")));
+ (void)unsubscribe:(id<MainReduks>)receiver subscriptionTag:(NSString *)subscriptionTag __attribute__((swift_name("unsubscribe(_:subscriptionTag:)")));
+ (void)unsubscribeAll:(id<MainReduks>)receiver __attribute__((swift_name("unsubscribeAll(_:)")));
+ (MainDispatcherFn *)getDispatcherFn:(id<MainReduks>)receiver __attribute__((swift_name("getDispatcherFn(_:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreKt")))
@interface MainStoreKt : KotlinBase
+ (id<MainStoreSubscription>)subscribe:(id<MainStore>)receiver lambda:(MainKotlinUnit *(^)(void))lambda __attribute__((swift_name("subscribe(_:lambda:)")));
+ (id<MainStoreSubscription> _Nullable)subscribe:(id<MainStore>)receiver sb:(id<MainStoreSubscriberBuilder> _Nullable)sb __attribute__((swift_name("subscribe(_:sb:)")));
+ (MainDispatcherFn *)getDispatcherFn:(id<MainStore>)receiver __attribute__((swift_name("getDispatcherFn(_:)")));
+ (id _Nullable)invoke:(id (^ _Nullable)(id))receiver action:(id)action __attribute__((swift_name("invoke(_:action:)")));
+ (id)dispatch_a:(id<MainStore>)receiver action:(id<MainAction>)action __attribute__((swift_name("dispatch_a(_:action:)")));
+ (id)dispatch_sa:(id<MainStore>)receiver action:(id<MainStandardAction>)action __attribute__((swift_name("dispatch_sa(_:action:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreSubscriptionKt")))
@interface MainStoreSubscriptionKt : KotlinBase
+ (void)unsubscribe:(NSMutableArray<id<MainStoreSubscription>> *)receiver __attribute__((swift_name("unsubscribe(_:)")));
+ (void)addToList:(id<MainStoreSubscription>)receiver subscriptions:(NSMutableArray<id<MainStoreSubscription>> *)subscriptions __attribute__((swift_name("addToList(_:subscriptions:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StoreCreatorKt")))
@interface MainStoreCreatorKt : KotlinBase
+ (id<MainStoreCreator>)enhancedWith:(id<MainStoreCreator>)receiver enhancers:(MainKotlinArray *)enhancers __attribute__((swift_name("enhancedWith(_:enhancers:)")));
+ (id<MainStoreCreator>)withMiddlewares:(id<MainStoreCreator>)receiver middlewares:(MainKotlinArray *)middlewares __attribute__((swift_name("withMiddlewares(_:middlewares:)")));
+ (id<MainStore>)create:(id<MainStoreCreator>)receiver reducer:(id _Nullable (^)(id _Nullable, id))reducer initialState:(id _Nullable)initialState enhancer:(id<MainStoreEnhancer>)enhancer __attribute__((swift_name("create(_:reducer:initialState:enhancer:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("BuildersKt")))
@interface MainBuildersKt : KotlinBase
+ (id (^)(id<MainStore>, id (^)(id), id))MiddlewareFnMiddlewareFn:(id (^)(id<MainStore>, id (^)(id), id))middlewareFn __attribute__((swift_name("MiddlewareFn(middlewareFn:)")));
+ (id _Nullable (^)(id _Nullable, id))ReducerFnReducerFn:(id _Nullable (^)(id _Nullable, id))reducerFn __attribute__((swift_name("ReducerFn(reducerFn:)")));
+ (MainStoreEnhancerImpl *)StoreEnhancerFnStoreEnhancerFn:(id<MainStoreCreator> (^)(id<MainStoreCreator>))storeEnhancerFn __attribute__((swift_name("StoreEnhancerFn(storeEnhancerFn:)")));
+ (MainStoreSubscriberImpl *)StoreSubscriberFnSubscriberFn:(MainKotlinUnit *(^)(void))subscriberFn __attribute__((swift_name("StoreSubscriberFn(subscriberFn:)")));
+ (MainStoreSubscriberBuilderImpl *)StoreSubscriberBuilderFnStoreSubscriberBuilderFn:(id<MainStoreSubscriber> (^)(id<MainStore>))storeSubscriberBuilderFn __attribute__((swift_name("StoreSubscriberBuilderFn(storeSubscriberBuilderFn:)")));
+ (MainStoreSubscriberBuilderImpl2 *)StoreSubscriberBuilderFnStoreSubscriberBuilderFn2:(id<MainStoreSubscriber> (^)(id<MainStore>, MainSelectorBuilder *))storeSubscriberBuilderFn2 __attribute__((swift_name("StoreSubscriberBuilderFn(storeSubscriberBuilderFn2:)")));
+ (MainThunkImpl *)ThunkFnThunkFn:(id (^)(id (^)(id), id _Nullable))thunkFn __attribute__((swift_name("ThunkFn(thunkFn:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CombineEnhancersKt")))
@interface MainCombineEnhancersKt : KotlinBase
+ (MainStoreEnhancerImpl *)combineEnhancersEnhancers:(MainKotlinArray *)enhancers __attribute__((swift_name("combineEnhancers(enhancers:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CombineReducersKt")))
@interface MainCombineReducersKt : KotlinBase
+ (id _Nullable (^)(id _Nullable, id))combineReducersReducers:(MainKotlinArray *)reducers __attribute__((swift_name("combineReducers(reducers:)")));
+ (id _Nullable (^)(id _Nullable, id))combinedWith:(id _Nullable (^)(id _Nullable, id))receiver reducers:(MainKotlinArray *)reducers __attribute__((swift_name("combinedWith(_:reducers:)")));
+ (id _Nullable (^)(id _Nullable, id))plus:(id _Nullable (^)(id _Nullable, id))receiver other:(id _Nullable (^)(id _Nullable, id))other __attribute__((swift_name("plus(_:other:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ReselectKt")))
@interface MainReselectKt : KotlinBase
+ (id<MainMemoizer>)computationMemoizerComputeFn:(id _Nullable (^)(MainKotlinArray *))computeFn __attribute__((swift_name("computationMemoizer(computeFn:)")));
+ (id<MainMemoizer>)singleInputMemoizerFunc:(id _Nullable (^)(MainKotlinArray *))func __attribute__((swift_name("singleInputMemoizer(func:)")));
+ (void)whenChangeOf:(id _Nullable)receiver selector:(id<MainSelector>)selector blockfn:(MainKotlinUnit *(^)(id _Nullable))blockfn __attribute__((swift_name("whenChangeOf(_:selector:blockfn:)")));
@property (class, readonly) MainBoolean *(^byRefEqualityCheck)(id, id);
@property (class, readonly) MainBoolean *(^byValEqualityCheck)(id, id);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ThunkMiddlewareKt")))
@interface MainThunkMiddlewareKt : KotlinBase
+ (id)thunkMiddlewareStore:(id<MainStore>)store nextDispatcher:(id (^)(id))nextDispatcher action:(id)action __attribute__((swift_name("thunkMiddleware(store:nextDispatcher:action:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ApplyMiddlewareKt")))
@interface MainApplyMiddlewareKt : KotlinBase
+ (id<MainStore>)applyMiddleware:(id<MainStore>)receiver middlewares:(MainKotlinArray *)middlewares __attribute__((swift_name("applyMiddleware(_:middlewares:)")));
+ (id<MainStoreEnhancer>)toEnhancer:(id (^)(id<MainStore>, id (^)(id), id))receiver __attribute__((swift_name("toEnhancer(_:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AppStateKt")))
@interface MainAppStateKt : KotlinBase
@property (class, readonly) id<MainStore> appStore;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ReducersKt")))
@interface MainReducersKt : KotlinBase
+ (MainAppState *)incrementCartForItemState:(MainAppState *)state itemId:(NSString *)itemId __attribute__((swift_name("incrementCartForItem(state:itemId:)")));
@property (class, readonly) MainAppState *(^reducer)(MainAppState *, id);
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("GatewayResponseKt")))
@interface MainGatewayResponseKt : KotlinBase
+ (MainGatewayResponse *)retrySuccessOrThrowNumRetries:(int32_t)numRetries retryWaitInMs:(int64_t)retryWaitInMs ex:(MainKotlinException *)ex f:(MainGatewayResponse *(^)(void))f __attribute__((swift_name("retrySuccessOrThrow(numRetries:retryWaitInMs:ex:f:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TransformFunctionsKt")))
@interface MainTransformFunctionsKt : KotlinBase
+ (NSArray<id> *)toViewState:(NSArray<id> *)receiver cart:(MainCart *)cart loadingStoreInfo:(MainStoreInfoResponse *)loadingStoreInfo tintColorRes:(int32_t)tintColorRes __attribute__((swift_name("toViewState(_:cart:loadingStoreInfo:tintColorRes:)")));
@property (class, readonly) MainItemCarouselViewState *testItemCarouselPlaceholder;
@end;

__attribute__((swift_name("KotlinThrowable")))
@interface MainKotlinThrowable : KotlinBase
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(MainKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(MainKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (MainKotlinArray *)getStackTrace __attribute__((swift_name("getStackTrace()")));
- (void)printStackTrace __attribute__((swift_name("printStackTrace()")));
@property (readonly) MainKotlinThrowable * _Nullable cause;
@property (readonly) NSString * _Nullable message;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinUnit")))
@interface MainKotlinUnit : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)unit __attribute__((swift_name("init()")));
@end;

__attribute__((swift_name("KotlinCoroutineContextKey")))
@protocol MainKotlinCoroutineContextKey
@required
@end;

__attribute__((swift_name("KotlinContinuation")))
@protocol MainKotlinContinuation
@required
- (void)resumeWithResult:(id _Nullable)result __attribute__((swift_name("resumeWith(result:)")));
@property (readonly) id<MainKotlinCoroutineContext> context;
@end;

__attribute__((swift_name("Kotlinx_coroutines_core_nativeRunnable")))
@protocol MainKotlinx_coroutines_core_nativeRunnable
@required
- (void)run __attribute__((swift_name("run()")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeEncoder")))
@protocol MainKotlinx_serialization_runtime_nativeEncoder
@required
- (id<MainKotlinx_serialization_runtime_nativeCompositeEncoder>)beginCollectionDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc collectionSize:(int32_t)collectionSize typeParams:(MainKotlinArray *)typeParams __attribute__((swift_name("beginCollection(desc:collectionSize:typeParams:)")));
- (id<MainKotlinx_serialization_runtime_nativeCompositeEncoder>)beginStructureDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc typeParams:(MainKotlinArray *)typeParams __attribute__((swift_name("beginStructure(desc:typeParams:)")));
- (void)encodeBooleanValue:(BOOL)value __attribute__((swift_name("encodeBoolean(value:)")));
- (void)encodeByteValue:(int8_t)value __attribute__((swift_name("encodeByte(value:)")));
- (void)encodeCharValue:(unichar)value __attribute__((swift_name("encodeChar(value:)")));
- (void)encodeDoubleValue:(double)value __attribute__((swift_name("encodeDouble(value:)")));
- (void)encodeEnumEnumDescription:(MainKotlinx_serialization_runtime_nativeEnumDescriptor *)enumDescription ordinal:(int32_t)ordinal __attribute__((swift_name("encodeEnum(enumDescription:ordinal:)")));
- (void)encodeFloatValue:(float)value __attribute__((swift_name("encodeFloat(value:)")));
- (void)encodeIntValue:(int32_t)value __attribute__((swift_name("encodeInt(value:)")));
- (void)encodeLongValue:(int64_t)value __attribute__((swift_name("encodeLong(value:)")));
- (void)encodeNotNullMark __attribute__((swift_name("encodeNotNullMark()")));
- (void)encodeNull __attribute__((swift_name("encodeNull()")));
- (void)encodeNullableSerializableValueSerializer:(id<MainKotlinx_serialization_runtime_nativeSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeNullableSerializableValue(serializer:value:)")));
- (void)encodeSerializableValueSerializer:(id<MainKotlinx_serialization_runtime_nativeSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeSerializableValue(serializer:value:)")));
- (void)encodeShortValue:(int16_t)value __attribute__((swift_name("encodeShort(value:)")));
- (void)encodeStringValue:(NSString *)value __attribute__((swift_name("encodeString(value:)")));
- (void)encodeUnit __attribute__((swift_name("encodeUnit()")));
@property (readonly) id<MainKotlinx_serialization_runtime_nativeSerialContext> context;
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialDescriptor")))
@protocol MainKotlinx_serialization_runtime_nativeSerialDescriptor
@required
- (NSArray<id<MainKotlinAnnotation>> *)getElementAnnotationsIndex:(int32_t)index __attribute__((swift_name("getElementAnnotations(index:)")));
- (id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)getElementDescriptorIndex:(int32_t)index __attribute__((swift_name("getElementDescriptor(index:)")));
- (int32_t)getElementIndexName:(NSString *)name __attribute__((swift_name("getElementIndex(name:)")));
- (NSString *)getElementNameIndex:(int32_t)index __attribute__((swift_name("getElementName(index:)")));
- (NSArray<id<MainKotlinAnnotation>> *)getEntityAnnotations __attribute__((swift_name("getEntityAnnotations()")));
- (BOOL)isElementOptionalIndex:(int32_t)index __attribute__((swift_name("isElementOptional(index:)")));
@property (readonly) int32_t elementsCount;
@property (readonly) BOOL isNullable;
@property (readonly) MainKotlinx_serialization_runtime_nativeSerialKind *kind;
@property (readonly) NSString *name;
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeDecoder")))
@protocol MainKotlinx_serialization_runtime_nativeDecoder
@required
- (id<MainKotlinx_serialization_runtime_nativeCompositeDecoder>)beginStructureDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc typeParams:(MainKotlinArray *)typeParams __attribute__((swift_name("beginStructure(desc:typeParams:)")));
- (BOOL)decodeBoolean __attribute__((swift_name("decodeBoolean()")));
- (int8_t)decodeByte __attribute__((swift_name("decodeByte()")));
- (unichar)decodeChar __attribute__((swift_name("decodeChar()")));
- (double)decodeDouble __attribute__((swift_name("decodeDouble()")));
- (int32_t)decodeEnumEnumDescription:(MainKotlinx_serialization_runtime_nativeEnumDescriptor *)enumDescription __attribute__((swift_name("decodeEnum(enumDescription:)")));
- (float)decodeFloat __attribute__((swift_name("decodeFloat()")));
- (int32_t)decodeInt __attribute__((swift_name("decodeInt()")));
- (int64_t)decodeLong __attribute__((swift_name("decodeLong()")));
- (BOOL)decodeNotNullMark __attribute__((swift_name("decodeNotNullMark()")));
- (MainKotlinNothing * _Nullable)decodeNull __attribute__((swift_name("decodeNull()")));
- (id _Nullable)decodeNullableSerializableValueDeserializer:(id<MainKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer __attribute__((swift_name("decodeNullableSerializableValue(deserializer:)")));
- (id _Nullable)decodeSerializableValueDeserializer:(id<MainKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer __attribute__((swift_name("decodeSerializableValue(deserializer:)")));
- (int16_t)decodeShort __attribute__((swift_name("decodeShort()")));
- (NSString *)decodeString __attribute__((swift_name("decodeString()")));
- (void)decodeUnit __attribute__((swift_name("decodeUnit()")));
- (id _Nullable)updateNullableSerializableValueDeserializer:(id<MainKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer old:(id _Nullable)old __attribute__((swift_name("updateNullableSerializableValue(deserializer:old:)")));
- (id _Nullable)updateSerializableValueDeserializer:(id<MainKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer old:(id _Nullable)old __attribute__((swift_name("updateSerializableValue(deserializer:old:)")));
@property (readonly) id<MainKotlinx_serialization_runtime_nativeSerialContext> context;
@property (readonly) MainKotlinx_serialization_runtime_nativeUpdateMode *updateMode;
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialClassDescImpl")))
@interface MainKotlinx_serialization_runtime_nativeSerialClassDescImpl : KotlinBase <MainKotlinx_serialization_runtime_nativeSerialDescriptor>
- (instancetype)initWithName:(NSString *)name generatedSerializer:(id<MainKotlinx_serialization_runtime_nativeGeneratedSerializer> _Nullable)generatedSerializer __attribute__((swift_name("init(name:generatedSerializer:)"))) __attribute__((objc_designated_initializer));
- (void)addElementName:(NSString *)name isOptional:(BOOL)isOptional __attribute__((swift_name("addElement(name:isOptional:)")));
- (void)pushAnnotationA:(id<MainKotlinAnnotation>)a __attribute__((swift_name("pushAnnotation(a:)")));
- (void)pushClassAnnotationA:(id<MainKotlinAnnotation>)a __attribute__((swift_name("pushClassAnnotation(a:)")));
- (void)pushDescriptorDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("pushDescriptor(desc:)")));
@end;

__attribute__((swift_name("KotlinIterator")))
@protocol MainKotlinIterator
@required
- (BOOL)hasNext __attribute__((swift_name("hasNext()")));
- (id _Nullable)next __attribute__((swift_name("next()")));
@end;

__attribute__((swift_name("KotlinException")))
@interface MainKotlinException : MainKotlinThrowable
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(MainKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(MainKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeCompositeEncoder")))
@protocol MainKotlinx_serialization_runtime_nativeCompositeEncoder
@required
- (void)encodeBooleanElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(BOOL)value __attribute__((swift_name("encodeBooleanElement(desc:index:value:)")));
- (void)encodeByteElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(int8_t)value __attribute__((swift_name("encodeByteElement(desc:index:value:)")));
- (void)encodeCharElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(unichar)value __attribute__((swift_name("encodeCharElement(desc:index:value:)")));
- (void)encodeDoubleElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(double)value __attribute__((swift_name("encodeDoubleElement(desc:index:value:)")));
- (void)encodeFloatElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(float)value __attribute__((swift_name("encodeFloatElement(desc:index:value:)")));
- (void)encodeIntElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(int32_t)value __attribute__((swift_name("encodeIntElement(desc:index:value:)")));
- (void)encodeLongElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(int64_t)value __attribute__((swift_name("encodeLongElement(desc:index:value:)")));
- (void)encodeNonSerializableElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(id)value __attribute__((swift_name("encodeNonSerializableElement(desc:index:value:)")));
- (void)encodeNullableSerializableElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index serializer:(id<MainKotlinx_serialization_runtime_nativeSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeNullableSerializableElement(desc:index:serializer:value:)")));
- (void)encodeSerializableElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index serializer:(id<MainKotlinx_serialization_runtime_nativeSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeSerializableElement(desc:index:serializer:value:)")));
- (void)encodeShortElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(int16_t)value __attribute__((swift_name("encodeShortElement(desc:index:value:)")));
- (void)encodeStringElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(NSString *)value __attribute__((swift_name("encodeStringElement(desc:index:value:)")));
- (void)encodeUnitElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("encodeUnitElement(desc:index:)")));
- (void)endStructureDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("endStructure(desc:)")));
- (BOOL)shouldEncodeElementDefaultDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("shouldEncodeElementDefault(desc:index:)")));
@property (readonly) id<MainKotlinx_serialization_runtime_nativeSerialContext> context;
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeEnumDescriptor")))
@interface MainKotlinx_serialization_runtime_nativeEnumDescriptor : MainKotlinx_serialization_runtime_nativeSerialClassDescImpl
- (instancetype)initWithName:(NSString *)name choices:(MainKotlinArray *)choices __attribute__((swift_name("init(name:choices:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithName:(NSString *)name generatedSerializer:(id<MainKotlinx_serialization_runtime_nativeGeneratedSerializer> _Nullable)generatedSerializer __attribute__((swift_name("init(name:generatedSerializer:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialContext")))
@protocol MainKotlinx_serialization_runtime_nativeSerialContext
@required
- (id<MainKotlinx_serialization_runtime_nativeKSerializer> _Nullable)getKclass:(id<MainKotlinKClass>)kclass __attribute__((swift_name("get(kclass:)")));
- (id<MainKotlinx_serialization_runtime_nativeKSerializer> _Nullable)getByValueValue:(id)value __attribute__((swift_name("getByValue(value:)")));
@end;

__attribute__((swift_name("KotlinAnnotation")))
@protocol MainKotlinAnnotation
@required
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialKind")))
@interface MainKotlinx_serialization_runtime_nativeSerialKind : KotlinBase
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeCompositeDecoder")))
@protocol MainKotlinx_serialization_runtime_nativeCompositeDecoder
@required
- (BOOL)decodeBooleanElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeBooleanElement(desc:index:)")));
- (int8_t)decodeByteElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeByteElement(desc:index:)")));
- (unichar)decodeCharElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeCharElement(desc:index:)")));
- (int32_t)decodeCollectionSizeDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("decodeCollectionSize(desc:)")));
- (double)decodeDoubleElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeDoubleElement(desc:index:)")));
- (int32_t)decodeElementIndexDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("decodeElementIndex(desc:)")));
- (float)decodeFloatElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeFloatElement(desc:index:)")));
- (int32_t)decodeIntElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeIntElement(desc:index:)")));
- (int64_t)decodeLongElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeLongElement(desc:index:)")));
- (id _Nullable)decodeNullableSerializableElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index deserializer:(id<MainKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer __attribute__((swift_name("decodeNullableSerializableElement(desc:index:deserializer:)")));
- (id _Nullable)decodeSerializableElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index deserializer:(id<MainKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer __attribute__((swift_name("decodeSerializableElement(desc:index:deserializer:)")));
- (int16_t)decodeShortElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeShortElement(desc:index:)")));
- (NSString *)decodeStringElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeStringElement(desc:index:)")));
- (void)decodeUnitElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeUnitElement(desc:index:)")));
- (void)endStructureDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("endStructure(desc:)")));
- (id _Nullable)updateNullableSerializableElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index deserializer:(id<MainKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer old:(id _Nullable)old __attribute__((swift_name("updateNullableSerializableElement(desc:index:deserializer:old:)")));
- (id _Nullable)updateSerializableElementDesc:(id<MainKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index deserializer:(id<MainKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer old:(id _Nullable)old __attribute__((swift_name("updateSerializableElement(desc:index:deserializer:old:)")));
@property (readonly) id<MainKotlinx_serialization_runtime_nativeSerialContext> context;
@property (readonly) MainKotlinx_serialization_runtime_nativeUpdateMode *updateMode;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinNothing")))
@interface MainKotlinNothing : KotlinBase
@end;

__attribute__((swift_name("KotlinComparable")))
@protocol MainKotlinComparable
@required
- (int32_t)compareToOther:(id _Nullable)other __attribute__((swift_name("compareTo(other:)")));
@end;

__attribute__((swift_name("KotlinEnum")))
@interface MainKotlinEnum : KotlinBase <MainKotlinComparable>
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer));
- (int32_t)compareToOther:(MainKotlinEnum *)other __attribute__((swift_name("compareTo(other:)")));
@property (readonly) NSString *name;
@property (readonly) int32_t ordinal;
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_serialization_runtime_nativeUpdateMode")))
@interface MainKotlinx_serialization_runtime_nativeUpdateMode : MainKotlinEnum
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
@property (class, readonly) MainKotlinx_serialization_runtime_nativeUpdateMode *banned;
@property (class, readonly) MainKotlinx_serialization_runtime_nativeUpdateMode *overwrite;
@property (class, readonly) MainKotlinx_serialization_runtime_nativeUpdateMode *update;
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (int32_t)compareToOther:(MainKotlinx_serialization_runtime_nativeUpdateMode *)other __attribute__((swift_name("compareTo(other:)")));
@end;

__attribute__((swift_name("KotlinKDeclarationContainer")))
@protocol MainKotlinKDeclarationContainer
@required
@end;

__attribute__((swift_name("KotlinKAnnotatedElement")))
@protocol MainKotlinKAnnotatedElement
@required
@end;

__attribute__((swift_name("KotlinKClassifier")))
@protocol MainKotlinKClassifier
@required
@end;

__attribute__((swift_name("KotlinKClass")))
@protocol MainKotlinKClass <MainKotlinKDeclarationContainer, MainKotlinKAnnotatedElement, MainKotlinKClassifier>
@required
- (BOOL)isInstanceValue:(id _Nullable)value __attribute__((swift_name("isInstance(value:)")));
@property (readonly) NSString * _Nullable qualifiedName;
@property (readonly) NSString * _Nullable simpleName;
@end;

NS_ASSUME_NONNULL_END
