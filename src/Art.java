public class Art extends Item{
    private String artistName;
    private int creationYear;

    public Art(String id, String name, double startingPrice, String artistName, int creationYear) {
        super(id, name, startingPrice);
        this.artistName = artistName;
        this.creationYear = creationYear;
    }

    @Override
    public void showDetails() {
        System.out.println("Tác phẩm nghệ thuật: " + getName() + " - Tác giả: " + artistName + " - Năm sáng tác: " + creationYear + " - Giá: " + getStartingPrice());
    }

    public String getArtistName() {
        return artistName;
    }

    public int getCreationYear() {
        return creationYear;
    }
}
