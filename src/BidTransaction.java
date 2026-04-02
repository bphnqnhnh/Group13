import java.time.LocalDate;
import java.time.LocalDateTime;

public class BidTransaction {
    private String transactionId;
    private double amount;
    private LocalDateTime timestamp;
    private Bidder bidder;

    public BidTransaction(String transactionId, double amount, LocalDate timestamp, Bidder bidder) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.bidder = bidder;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public Bidder getBidder() {
        return bidder;
    }
}
