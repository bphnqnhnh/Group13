import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuctionManager {
    private static AuctionManager instance;
    private final List<Auction> activeAuctions;

    private AuctionManager() {
        this.activeAuctions = new ArrayList<>();
    }

    public static AuctionManager getInstance() {
        if (instance == null) {
            instance = new AuctionManager();
        }
        return instance;
    }

    public List<Auction> getActiveAuctions() {
        return Collections.unmodifiableList(activeAuctions);
    }
}
