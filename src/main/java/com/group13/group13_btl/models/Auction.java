package com.group13.group13_btl.models;

import com.group13.group13_btl.services.AuctionObserver;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Auction {
    private String auctionId;
    private Item item;
    private double currentPrice;
    private AuctionStatus status;
    private List<BidTransaction> bidHistory;
    private Seller seller;
    private List<AuctionObserver> observers;

    public Auction(String auctionId, Item item, double currentPrice, AuctionStatus status, Seller seller) {
        this.auctionId = auctionId;
        this.item = item;
        this.currentPrice = currentPrice;
        this.status = status;
        this.seller = seller;
        this.bidHistory = new ArrayList<>();
        this.observers = new ArrayList<>();

        if (seller instanceof AuctionObserver) {
            addObserver((AuctionObserver) seller);
        }
    }

    // Getter
    public String getAuctionId() { return auctionId; }
    public Item getItem() { return item; }
    public double getCurrentPrice() { return currentPrice; }
    public AuctionStatus getStatus() { return status; }
    public List<BidTransaction> getBidHistory() { return bidHistory; }
    public Seller getSeller() { return seller; }
    public List<AuctionObserver> observers() { return observers;}
    
    // Observer Pattern
    public void addObserver(AuctionObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AuctionObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver(AuctionEvent event) {
        for (AuctionObserver observer : observers) {
            observer.update(event, this);
        }
    }


    public synchronized void startAuction() {
        if (this.status == AuctionStatus.OPEN) {
            this.status = AuctionStatus.RUNNING;
            System.out.println("Phiên đấu giá " + this.auctionId + " cho sản phẩm '" + item.getName() + "' đã chính thức bắt đầu!");
            notifyObserver(AuctionEvent.AUCTION_STARTED);
        } else {
            System.out.println("Thất bại: Không thể bắt đầu vì phiên đấu giá đang ở trạng thái " + this.status);
        }
    }

    public synchronized boolean placeBid(Bidder bidder, double bidAmount) {
        if (this.status != AuctionStatus.RUNNING) {
            System.out.println("Thất bại: Phiên đấu giá này không mở!");
            return false;
        }

        if (bidAmount <= this.currentPrice) {
            System.out.println("Thất bại: Mức giá đưa ra (" + bidAmount + ") không cao hơn giá hiện tại (" + this.currentPrice + ")!");
            return false;
        }
        if (bidder instanceof AuctionObserver && !observers.contains(bidder)) {
            addObserver((AuctionObserver) bidder);
        }

        this.currentPrice = bidAmount;
        String newTxnId = "TXN-" + UUID.randomUUID().toString().substring(0, 8);
        BidTransaction newTransaction = new BidTransaction(newTxnId, bidAmount, LocalDateTime.now(), bidder);

        this.bidHistory.add(newTransaction);
        System.out.println("Thành công: " + bidder.getName() + " (" + bidder.getEmail() + ") đã trả giá " + bidAmount);
        notifyObserver(AuctionEvent.BID_PLACED);
        return true;
    }

    public synchronized void finishAuction() {
        if (this.status == AuctionStatus.RUNNING) {
            this.status = AuctionStatus.FINISHED;
            if (bidHistory.isEmpty()) {
                System.out.println("Phiên đấu giá " + this.auctionId + " đã kết thúc. Không có ai đấu giá.");
            } else {
                BidTransaction lastBid = bidHistory.get(bidHistory.size() - 1);
                System.out.println("Phiên đấu giá " + this.auctionId + " đã kết thúc. Người thắng: " + 
                                lastBid.getBidder().getName() + " với giá: " + lastBid.getAmount());
            }
            notifyObserver(AuctionEvent.AUCTION_FINISHED);
        } else {
            System.out.println("Chỉ có thể kết thúc phiên đấu giá đang chạy!");
        }
    }

    public void displayAuctionDetails() {
        System.out.println("\n----- THÔNG TIN PHIÊN ĐẤU GIÁ -----");
        System.out.println("ID: " + auctionId);
        System.out.println("Sản phẩm: " + item.getName());
        System.out.println("Người bán: " + seller.getName() + " (" + seller.getEmail() + ")");
        System.out.println("Giá hiện tại: " + currentPrice);
        System.out.println("Trạng thái: " + status);
        System.out.println("Số lần đấu giá: " + bidHistory.size());
        if (!bidHistory.isEmpty()) {
            System.out.println("Lịch sử đấu giá:");
            for (BidTransaction txn : bidHistory) {
                System.out.println("  - " + txn.getBidder().getName() + ": " + txn.getAmount() + 
                                 " (lúc " + txn.getTimestamp() + ")");
            }
        }
        System.out.println("----------------------------------\n");
    }
}
