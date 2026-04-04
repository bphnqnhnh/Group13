public class Bidder extends User {
    private double bidAmount;
    public Bidder(String id, String username, String email, String itemName, double bidAmount) {
        super(id, username, email, itemName);
        this.bidAmount = bidAmount;
    }

    public void performAction() {
        System.out.println("Người đấu giá:" + getUsername() + " đang xem sản phẩm " + getItemName() + " và đấu giá: " + bidAmount);
    }
    public double getBidAmount() {
        return bidAmount;
    }
