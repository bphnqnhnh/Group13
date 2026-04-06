public class Bidder extends User {
<<<<<<< HEAD
    public Bidder(String id, String name, String email, String password) {
=======
    private double bidAmount;
    private String itemName;

    public Bidder(String id, String name, String email, String password, String itemName, double bidAmount) {
>>>>>>> 740bcefb93c5b6107aba1d683dc310de728e674d
        super(id, name, email, password);
    }
<<<<<<< HEAD
    public void placeBid(Auction auction, double bidAmount) {
        System.out.println("Người đấu giá: " + this.name + "đang đặt giá " + bidAmount);
        auction.placeBid(this, bidAmount);
    }
    public void displayInfo() {
        System.out.println("Tôi là người đấu giá (Bidder)");
    }
=======

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
>>>>>>> 740bcefb93c5b6107aba1d683dc310de728e674d
