public class Admin extends User {
    public Admin(String id, String username, String email) {
        super(id, username, email);
    }
    public void performAction() {
        System.out.println("Admin đang duyệt các phiên đấu giá và kiểm tra hệ thống.");
    }
    public void banUser(String targetUsername) {
        System.out.println("Admin " + getUsername() + " đã khóa tài khoản của " + targetUsername);
    }
    public void deleteListing(String targetItemName) {
        System.out.println("Admin " + getUsername() + " xóa bài đăng sản phẩm của '" + targetItemName + "' do vi phạm quy định");
    }
}