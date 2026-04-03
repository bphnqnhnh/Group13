import java.util.ArrayList;

public class Auction {
    private String auctionId;
    private double currentPrice;
    private AuctionStatus status;
    private List<BidTransaction> bidHistory;

    public Auction(String auctionId, double currentPrice, AuctionStatus status) {
        this.auctionId = auctionId;
        this.currentPrice = currentPrice;
        this.status = status;
        this.bidHistory = new ArrayList<>();
    }
}
