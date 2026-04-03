import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public String getAuctionId() {
        return auctionId;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public AuctionStatus getStatus() {
        return status;
    }

    public List<BidTransaction> getBidHistory() {
        return bidHistory;
    }

    public void startAuction() {
        if (this.status == AuctionStatus.OPEN) {
            this.status = AuctionStatus.RUNNING;
            System.out.println("Phiên đấu giá " + this.auctionId + " đã chính thức bắt đầu!");
        }

        else {
            System.out.println("Thất bại: Không thể bắt đầu vì phiên đấu giá đang ở trạng thái " + this.status);
        }

    }

    public boolean placeBid(Bidder bidder, double bidAmount) {
        if (this.status != AuctionStatus.RUNNING) {
            System.out.println("Thất bại: Phiên đấu giá này không mở!");
            return false;
        }

        if (bidAmount <= this.currentPrice) {
            System.out.println("Thất bại: Mức giá đưa ra (" + bidAmount + ") không cao hơn giá hiện tại (" + this.currentPrice + ")!");
            return false;
        }

        this.currentPrice = bidAmount;
        String newTxnId = "TXH-" + UUID.randomUUID().toString().substring(0, 8);
        BidTransaction newTransaction = new BidTransaction(newTxnId, bidAmount, LocalDateTime.now(), bidder);

        this.bidHistory.add(newTransaction);
        System.out.println("Thành công: " + bidder.getEmail() + " đã trả giá " + bidAmount);
        return true;
    }
}
