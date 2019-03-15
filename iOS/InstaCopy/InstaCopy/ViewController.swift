//
//  ViewController.swift
//  InstaCopy
//
//  Created by Patrick Jackson on 3/12/19.
//  Copyright © 2019 Willowtree. All rights reserved.
//

import UIKit
import main

class ViewController: UIViewController, UITableViewDataSource, StoreSubscriber {
    
    @IBOutlet weak var cartBadge: BadgeSwift!
    @IBOutlet weak var tableView: UITableView!

    var subscription: StoreSubscription?
    var items: [Any] = []

    func numberOfSectionsInTableView(tableView: UITableView) -> Int {
        return 1
    }
    
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return items.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let item = items[indexPath.row]
        
        switch item {
        case is StoreHeaderViewState:
            if let cell = tableView.dequeueReusableCell(withIdentifier: HeaderCellTableViewCell.identifier, for: indexPath) as? HeaderCellTableViewCell {
                cell.item = item as! StoreHeaderViewState
                return cell
            }
        case is DeliveryOptionViewState:
            if let cell = tableView.dequeueReusableCell(withIdentifier: DeliverySelectorCell.identifier, for: indexPath) as? DeliverySelectorCell {
                cell.item = item as! DeliveryOptionViewState
                return cell
            }
        case is ItemCarouselViewState:
            if let cell = tableView.dequeueReusableCell(withIdentifier: CarouselCell.identifier, for: indexPath) as? CarouselCell {
                cell.list = item as! ItemCarouselViewState
                return cell
            }
        case is InfoCardViewState:
            if let cell = tableView.dequeueReusableCell(withIdentifier: InfoCardCell.identifier, for: indexPath) as? InfoCardCell {
                cell.item = item as! InfoCardViewState
                return cell
            }
        case is FreeDeliveryCardViewState:
            if let cell = tableView.dequeueReusableCell(withIdentifier: FreeDeliveryCell.identifier, for: indexPath) as? FreeDeliveryCell {
                cell.item = item as! FreeDeliveryCardViewState
                return cell
            }
        default:
            return UITableViewCell()
        }
        return UITableViewCell()
    }
    
    func onStateChange() {
        let state = AppStateKt.appStore.state as! AppState
        cartBadge.text = String(state.cart.totalNumItems())
        items = TransformFunctionsKt.toViewState(state.listData, cart: state.cart, loadingStoreInfo: state.storeInfoResponse, tintColorRes: 0)
        
        tableView.reloadData()
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        tableView?.dataSource = self
    }
    
    override func viewWillAppear(_ animated: Bool) {
        subscription = AppStateKt.appStore.subscribe(storeSubscriber: self)
        AppStateKt.appStore.dispatch(NetworkThunks(uiContext: main.UI()).fetchStoreInfoAndFeed(storeId: "sprouts"))
    }
    
    deinit {
        subscription?.unsubscribe()
    }
}

