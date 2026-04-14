import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

    public void addAuction(Auction auction) {
        if (auction != null) {
            activeAuctions.add(auction);
            System.out.println("Phiên đấu giá " + auction.getAuctionId() + " đã được thêm vào hệ thống!");
        }
    }

    public void removeAuction(String auctionId) {
        boolean removed = activeAuctions.removeIf(auction -> auction.getAuctionId().equals(auctionId));
        if (removed) {
            System.out.println("Phiên đấu giá " + auctionId + " đã được xóa khỏi hệ thống!");
        } else {
            System.out.println("Không tìm thấy phiên đấu giá " + auctionId);
        }
    }

    public Optional<Auction> findAuction(String auctionId) {
        return activeAuctions.stream()
                .filter(auction -> auction.getAuctionId().equals(auctionId))
                .findFirst();
    }

    public void displayAllAuctions() {
        if (activeAuctions.isEmpty()) {
            System.out.println("Hiện không có phiên đấu giá nào");
            return;
        }
        System.out.println("\n===== DANH SÁCH CÁC PHIÊN ĐẤU GIÁ =====");
        for (Auction auction : activeAuctions) {
            System.out.println("ID: " + auction.getAuctionId() + 
                             " | Giá hiện tại: " + auction.getCurrentPrice() + 
                             " | Trạng thái: " + auction.getStatus() +
                             " | Hàng hóa: " + auction.getItem().getName());
        }
        System.out.println("=====================================\n");
    }

    public int getAuctionCount() {
        return activeAuctions.size();
    }
}
