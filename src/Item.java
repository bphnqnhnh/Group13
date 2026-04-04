public abstract class Item extends Entity {
    private double startingPrice;
    private String description;

    public Item (String id, String name, double startingPrice) {
        super(id, name);
        this.startingPrice = startingPrice;
        this.description = description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public abstract void showDetails();
}
