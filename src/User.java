public abstract class User extends Entity {
    protected String username;
    protected String email;
    public User(String id, String username, String email) {
        super(id);
        this.username = username;
        this.email = email;
    }
    public String getUsername() { return username; }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {return email;}
    public void setEmail(String email) {
        this.email = email;
    }
    public abstract void performAction();
}