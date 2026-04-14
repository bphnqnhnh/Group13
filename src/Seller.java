
public class Seller extends User implements AuctionObserver {
    public Seller(String id, String name, String email, String password) {
        super(id, name, email, password);
    }
    public Auction createAuction(String auctionId, Item item, double currentPrice, AuctionStatus status, AuctionEvent event) {
        System.out.println("Người bán hàng: " + getName() + "đang tạo phiên đấu gía mới cho: " + item.getName());
        return new Auction(auctionId, item, currentPrice, AuctionStatus.OPEN, this, event);
    }
    public void displayInfo() {
        System.out.println("Tôi là người bán hàng (Seller)");
    }

    public void update(AuctionEvent event, Auction auction) {
        if (event == AuctionEvent.AUCTION_STARTED) {
            System.out.println("Thông báo cho người bán " + this.getName() + ": Phiên đấu giá '" + auction.getAuctionId() + "'của bạn đã bắt đầu!");
        }
        else if (event == AuctionEvent.BID_PLACED) {
            System.out.println("Thông báo cho người bán " + this.getName() + ": Có người đặt giá mới trong phiên đấu giá '" + auction.getAuctionId() + "', giá hiện tại: " + auction.getCurrentPrice());
        }
        else if (event == AuctionEvent.AUCTION_FINISHED) {
            System.out.println("Thông báo cho người bán " + this.getName() + ": phiên đấu giá '" + auction.getAuctionId() + "'của bạn đã kết thúc.");
        }
    }
}
