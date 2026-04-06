public abstract class User extends Entity {
    private String email;
    private String password;
    public User(String id, String name, String email, String password) {
        super(id, name);
        this.email = email;
        this.pasword = password;
    }
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
    public String getEmail() {
        return email;
    }
    public abstract void displayInfo();
}