public class Seller extends User {
    public Seller(String id, String name, String email, String password) {
        super(id, name, email, password);
    }
    public Aution createAuction(String auctionId, Item item, double startingPrice) {
        System.out.println("Người bán hàng: " + this.name + "đang tạo phiên đấu gía mới cho: " + item.getName());
        return new Auction(auctionId, item, startingPrice, AuctionStatus.OPEN, this);
    }
    public void displayInfo() {
        System.out.println("Tôi là người bán hàng (Seller)");
    }
<<<<<<< HEAD
=======
    public String getItemName() {
        return itemName;
    }
}

>>>>>>> 740bcefb93c5b6107aba1d683dc310de728e674d
