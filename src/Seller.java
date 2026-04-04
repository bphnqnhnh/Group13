public class Seller extends User {
    private double startingPrice;
    public Seller(String id, String username, String email, String itemName, double startingPrice) {
        super(id, username, email, itemName);
        this.startingPrice = startingPrice;
    }
    public void performAction() {
        System.out.println("Người bán:" + getUsername() + " đang tạo phiên đấu giá cho" + getItemName() + " với giá khởi điểm:" + startingPrice);
    }
    public double getStartingPrice() {
        return startingPrice;
    }

