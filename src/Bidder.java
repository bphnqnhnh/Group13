public class Bidder extends User {
    private double bidAmount;
    private String itemName;
    public Bidder(String id, String username, String email, String itemName, double bidAmount) {
        super(id, username, email);
        this.bidAmount = bidAmount;
        this.itemName = itemName;
    }

    public void performAction() {
        System.out.println("Người đấu giá:" + getUsername() + " đang xem sản phẩm " + getItemName() + " và đấu giá: " + bidAmount);
    }
    public double getBidAmount() {
        return bidAmount;
    }
    public void String getItemName() {
        return itemName;
    }
