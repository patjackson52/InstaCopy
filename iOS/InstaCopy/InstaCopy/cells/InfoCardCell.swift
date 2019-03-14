//
//  CouponCell.swift
//  InstaCopy
//
//  Created by Patrick Jackson on 3/14/19.
//  Copyright © 2019 Willowtree. All rights reserved.
//

import Foundation
import UIKit
import main

class InfoCardCell: UITableViewCell {
    
    var item: InfoCardViewState? {
        didSet {
        }
    }
    
    static var identifier: String {
        return "infoCard"
    }
}
