public abstract class User extends Entity {
    private String email;
    private String password;

    public User(String id, String name, String email, String password) {
        super(id, name);
        this.email = email;
        this.password = password;
    }
<<<<<<< HEAD
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
    public String getEmail() {
        return email;
    }
    public abstract void displayInfo();
=======

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return password;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public abstract void performAction();
>>>>>>> 740bcefb93c5b6107aba1d683dc310de728e674d
}