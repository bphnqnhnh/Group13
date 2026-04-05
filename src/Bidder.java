public class Bidder extends User {
    private double bidAmount;
    private String itemName;

    public Bidder(String id, String name, String email, String password, String itemName, double bidAmount) {
        super(id, name, email, password);
        this.bidAmount = bidAmount;
        this.itemName = itemName;
    }

    public void performAction() {
        System.out.println("Người đấu giá:" + getName() + " đang xem sản phẩm " + getItemName() + " và đấu giá: " + bidAmount);
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public String getItemName() {
        return itemName;
    }
}
