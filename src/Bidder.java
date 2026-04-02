public class Bidder extends User {
    public Bidder(String id, String username, String email) {
        super(id, username, email);
    }
    public void performAction() {
        System.out.println("Bidder đang lướt xem sản phẩm và đặt (bid) cho món đồ yêu thích.");
    }
}