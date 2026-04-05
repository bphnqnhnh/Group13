public abstract class User extends Entity {
    private String email;
    private String password;
    public User(String id, String name, String email, String password) {
        super(id, name);
        this.email = email;
        this.pasword = password;
    }
    public String getEmail() {
        return email;
    }
    public String getPassWord() {
        return password;
    }
    public abstract void performAction();
}