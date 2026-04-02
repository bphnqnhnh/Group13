public class Seller extends User {
    public Seller(String id, String username, String email) {
        super(id, username, email);
    }
    public void performAction() {
        System.out.println("Seller đang đăng tải một món đồ lên hệ thống để bắt đầu đấu giá.");
    }
}