import AuctionEvent;
import Auction;
import AuctionObserver;

public class Bidder extends User implements AuctionObserver {
    public Bidder(String id, String name, String email, String password) {
        super(id, name, email, password);
    }
    public void placeBid(Auction auction, double bidAmount) {
        System.out.println("Người đấu giá: " + getName() + "đang đặt giá " + bidAmount);
        auction.placeBid(this, bidAmount);
    }
    public void displayInfo() {
        System.out.println("Tôi là người đấu giá (Bidder)");
    }
<<<<<<< HEAD
    public void update(AuctionEvent event, Auction auction) {
        if (event == AuctionEvent.AUCTION_STARTED) {
            System.out.println("Thông báo cho " + this.getName() + ": Phiên đấu giá '" + auction.getAuctionId() + "' đã bắt đầu!");
        }
        else if (event == AuctionEvent.BID_PLACED) {
            System.out.println("Thông báo cho " + this.getName() + ": Có người đặt giá mới trong phiên đấu giá '" + auction.AuctionId() + "', giá hiện tại: " + auction.getCurrentPrice());
        }
        else ìf (event == AuctionEvent.AUCTION_FINISHED) {
            System.out.println("Thông báo cho " + this.getName() + ": phiên đấu giá '" + auction.AuctionId() + "' đã kết thúc.");
        }
    }
}
=======
}
>>>>>>> 87b4f62db401d6d7fd9f8956a02a58a217ec8fc4
