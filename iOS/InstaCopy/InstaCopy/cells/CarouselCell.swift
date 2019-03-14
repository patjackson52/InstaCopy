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
        contentView.backgroundColor = UIColor.green
        collectionView?.dataSource = self
        
    }
    
    static var nib:UINib {
        return UINib(nibName: identifier, bundle: nil)
    }
    
    override func prepareForReuse() {
        super.prepareForReuse()
        
    }
    
   
}
