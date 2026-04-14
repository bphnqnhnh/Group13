

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

    public void update(AuctionEvent event, Auction auction) {
        if (event == AuctionEvent.AUCTION_STARTED) {
            System.out.println("Thông báo cho " + this.getName() + ": Phiên đấu giá '" + auction.getAuctionId() + "' đã bắt đầu!");
        }
        else if (event == AuctionEvent.BID_PLACED) {
            System.out.println("Thông báo cho " + this.getName() + ": Có người đặt giá mới trong phiên đấu giá '" + auction.getAuctionId() + "', giá hiện tại: " + auction.getCurrentPrice());
        }
        else if (event == AuctionEvent.AUCTION_FINISHED) {
            System.out.println("Thông báo cho " + this.getName() + ": phiên đấu giá '" + auction.getAuctionId() + "' đã kết thúc.");
        }
    }
}


