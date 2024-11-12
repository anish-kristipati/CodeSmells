public class LoginService {
    public void login(User user) {
        System.out.println("User " + user.getName() + " logged in.");
    }

    public void logout(User user) {
        System.out.println("User " + user.getName() + " logged out.");
    }

    public void register(User user) {
        System.out.println("User " + user.getName() + " registered.");
    }

    public void resetPassword(User user) {
        System.out.println("Password for " + user.getName() + " reset.");
    }

    public void suspendAccount(User user) {
        System.out.println("Account for " + user.getName() + " suspended.");
    }

    public void activateAccount(User user) {
        System.out.println("Account for " + user.getName() + " activated.");
    }

}

class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

}
