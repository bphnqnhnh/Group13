public class Bidder extends User {
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
}