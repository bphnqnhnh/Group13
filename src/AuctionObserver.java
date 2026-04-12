public interface AuctionObserver {
    void update(AuctionEvent event, Auction auction);
}