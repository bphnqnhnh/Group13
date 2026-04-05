public class Seller extends User {
    private double startingPrice;
    private String itemName;
    public Seller(String id, String name, String email, String password, String itemName, double startingPrice) {
        super(id, name, email, password);
        this.startingPrice = startingPrice;
        this.itemName = itemName;
    }
    public void performAction() {
        System.out.println("Người bán:" + getName() + " đang tạo phiên đấu giá cho" + getItemName() + " với giá khởi điểm:" + startingPrice);
    }
    public double getStartingPrice() {
        return startingPrice;
    }
    public String getItemName() {
        return itemName;
    }
}

