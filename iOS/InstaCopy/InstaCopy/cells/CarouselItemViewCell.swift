//
//  CarouselItemViewCell.swift
//  InstaCopy
//
//  Created by Patrick Jackson on 3/14/19.
//  Copyright © 2019 Willowtree. All rights reserved.
//

import Foundation
import UIKit
import main

class CarouselItemViewCell: UICollectionViewCell {
    
    @IBOutlet weak var imageView: UIImageView!
    @IBOutlet weak var priceLabel: UILabel!
    @IBOutlet weak var discountLabel: UILabel!
    @IBOutlet weak var nameLabel: UILabel!
    @IBOutlet weak var amountLabel: UILabel!
    @IBOutlet weak var addButton: UIButton!
    @IBOutlet weak var quantityPicker: UIView!
    
    @IBAction func onTap(_ sender: Any) {
        AppStateKt.appStore.dispatch(Actions.OpenQuantityPickerAction(itemId: item!.item.id))
    }
    
    @IBAction func onAddTap(_ sender: Any) {
        AppStateKt.appStore.dispatch(Actions.AddToCartAction(itemId: item!.item.id))
    }
    
    @IBAction func onRemoveTap(_ sender: Any) {
        AppStateKt.appStore.dispatch(Actions.RemoveFromCartAction(itemId: item!.item.id))
    }

    /*
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        if (!cartButtons.isHidden) {
        let touch = touches.first
        guard let location = touch?.location(in: self.contentView) else { return }
        if !cartButtons.frame.contains(location) {
            print("Tapped outside the view")
            DispatchQueue.main.async {
                self.cartButtons.isHidden = true
            }
        }else {
            print("Tapped inside the view")
        }
        }
    }
 */
    
    var item: ItemViewState? {
        didSet {
            let url = URL(string: item!.item.imageUrl)
            if (url != nil) {
                loadImage(url: url!)
            }
            priceLabel.text = item!.item.priceOrg
            discountLabel.text = item!.item.discount
            nameLabel.text = item!.item.name
            amountLabel.text = item!.item.quantity
        }
    }
    
    static var identifier: String {
        return "carouselItem"
    }
    
    override func awakeFromNib() {
        super.awakeFromNib()
    }
    
    public func showQuantityPicker() {
        DispatchQueue.main.async {
            self.quantityPicker.isHidden = false
        }
    }
    
    func loadImage(url: URL) {
        let session = URLSession(configuration: .default)
        
        let downloadPicTask = session.dataTask(with: url) { (data, response, error) in
            // The download has finished.
            if let e = error {
                print("Error downloading cat picture: \(e)")
            } else {
                // No errors found.
                // It would be weird if we didn't have a response, so check for that too.
                if let res = response as? HTTPURLResponse {
                    print("Downloaded cat picture with response code \(res.statusCode)")
                    if let imageData = data {
                        DispatchQueue.main.async {
                            // Finally convert that Data into an image and do what you wish with it.
                            let image = UIImage(data: imageData)
                            self.imageView.image = image
                        }
                        // Do something with your image.
                    } else {
                        print("Couldn't get image: Image is nil")
                    }
                } else {
                    print("Couldn't get response code for some reason")
                }
            }
        }
        downloadPicTask.resume()
        
    }
}
