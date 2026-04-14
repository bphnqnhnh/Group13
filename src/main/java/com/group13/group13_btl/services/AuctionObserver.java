package com.group13.group13_btl.services;

import com.group13.group13_btl.models.Auction;
import com.group13.group13_btl.models.AuctionEvent;

public interface AuctionObserver {
    void update(AuctionEvent event, Auction auction);
}