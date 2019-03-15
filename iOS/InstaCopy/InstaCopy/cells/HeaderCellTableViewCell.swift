//
//  HeaderCellTableViewCell.swift
//  InstaCopy
//
//  Created by Patrick Jackson on 3/14/19.
//  Copyright © 2019 Willowtree. All rights reserved.
//

import UIKit
import main

class HeaderCellTableViewCell: UITableViewCell {
    
    @IBOutlet weak var myImageView: UIImageView!
    
    var item: StoreHeaderViewState? {
        didSet {
            let url = URL(string: item!.bckgrndImageUrl)
            if (url != nil) {
                loadImage(url: url!)
            }
        }
    }
    
    static var identifier: String {
        return "header"
    }
    
    var subscription: StoreSubscription?
    
    override func awakeFromNib() {
        super.awakeFromNib()
        contentView.backgroundColor = UIColor.red
        myImageView?.clipsToBounds = true
        myImageView?.contentMode = .scaleAspectFit
    }
    
    static var nib:UINib {
        return UINib(nibName: identifier, bundle: nil)
    }
    
    override func prepareForReuse() {
        super.prepareForReuse()
        myImageView?.image = nil
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
                            self.myImageView.image = image
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
