public abstract class Item extends Entity {
    private double startingPrice;

    public Item (String id, String name, double startingPrice) {
        super(id, name);
        this.startingPrice = startingPrice;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public abstract void showDetails();
}
