//
//  StoreHeaderCell.swift
//  InstaCopy
//
//  Created by Patrick Jackson on 3/14/19.
//  Copyright © 2019 Willowtree. All rights reserved.
//

import Foundation
import UIKit
import main

class StoreHeaderCell: UITableViewCell {
    
    @IBOutlet weak var bckgrdImageView: UIImageView!
    
    var item: StoreHeaderViewState? {
        didSet {
            bckgrdImageView?.image = UIImage(named: item!.bckgrndImageUrl)
        }
    }
    
    static var identifier: String {
        return String(describing: self)
    }
    
    override func awakeFromNib() {
        super.awakeFromNib()
        
        bckgrdImageView?.clipsToBounds = true
        bckgrdImageView?.contentMode = .scaleAspectFit
    }
    
    static var nib:UINib {
        return UINib(nibName: identifier, bundle: nil)
    }
    
    override func prepareForReuse() {
        super.prepareForReuse()
        
        bckgrdImageView?.image = nil
    }
}
