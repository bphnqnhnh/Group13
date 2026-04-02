public class Admin extends User {
    public Admin(String id, String username, String email) {
        super(id, username, email);
    }
    public void performAction() {
        System.out.println("Admin đang duyệt các phiên đấu giá và kiểm tra hệ thống.");
    }
}