public abstract class User extends Entity {
    private String username;
    private String email;
    public User(String id, String username, String email) {
        super(id);
        this.username = username;
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public void login() {
        System.out.println(username + " đã đăng nhập vào hệ thống.");
    }
    public void logout() {
        System.out.println(username + " đã đăng xuất.");
    }
    public abstract void performAction();
}