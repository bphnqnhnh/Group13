public abstract class User extends Entity {
    private String username;
    private String email;
    private String itemName;
    public User(String id, String username, String email, String itemName) {
        super(id);
        this.username = username;
        this.email = email;
        this.itemName = itemName;
    }
    public String getUsername() {
        return username;
    }
    public String getEmai() {
        return email;
    }
    public String getItemName() {
        return itemName;
    }
    public void login() {
        System.out.println(username + " đã đăng nhập vào hệ thống.")
    }
    public void logout() {
        System.out.println(username + " đã đăng xuất."
    }
    public abstract void performAction();
}