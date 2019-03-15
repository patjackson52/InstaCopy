//
//  CarouselCell.swift
//  InstaCopy
//
//  Created by Patrick Jackson on 3/14/19.
//  Copyright © 2019 Willowtree. All rights reserved.
//

import Foundation
import UIKit
import main

class CarouselCell: UITableViewCell, UICollectionViewDataSource {

    func collectionView(_ collectionView: UICollectionView, numberOfItemsInSection section: Int) -> Int {
        return list!.items.count
    }
    
    @IBOutlet var collectionView: UICollectionView!
    
    func collectionView(_ collectionView: UICollectionView, cellForItemAt indexPath: IndexPath) -> UICollectionViewCell {
        let item = list?.items[indexPath.row]
        
        let cell = collectionView.dequeueReusableCell(withReuseIdentifier: CarouselItemViewCell.identifier, for: indexPath) as? CarouselItemViewCell
        cell!.item = item as! ItemViewState
        return cell!
    }
    
    var list: ItemCarouselViewState? {
        didSet {
            collectionView.reloadData()
        }
    }
    
    static var identifier: String {
        return "itemCarousel"
    }
    
    override func awakeFromNib() {
        super.awakeFromNib()
        AppStateKt.viewEffectsMiddleware.subscribeToViewEffects(subscriber: viewEffectSubscriber)
//        ViewEffectsMiddleware().subscribeToViewEffects(subscriber: {effect in return KotlinUnit()})

        contentView.backgroundColor = UIColor.green
        collectionView?.dataSource = self
        
    }
    
    func viewEffectSubscriber(effect: ViewEffect) -> KotlinUnit {
        if (effect is ShowPickerViewEffect) {
            if let cell = collectionView.cellForItem(at: NSIndexPath(row: findIndexOf(itemId: (effect as? ShowPickerViewEffect)!.itemId) - 1, section: 0) as IndexPath) {
                (cell as! CarouselItemViewCell).showQuantityPicker()
            }

        }
        return KotlinUnit()
    }
    
    private func findIndexOf(itemId: String) -> Int {
        return list?.items.index(where: { $0.item.id == itemId }) ?? -1
    }
    
    static var nib:UINib {
        return UINib(nibName: identifier, bundle: nil)
    }
    
    deinit {
        AppStateKt.viewEffectsMiddleware.unsubscribe(subscriber: viewEffectSubscriber)
    }
}
