public class LoginService {
    private final LoginManager loginManager = new LoginManager();
    private final RegistrationManager registrationManager = new RegistrationManager();
    private final AccountManager accountManager = new AccountManager();

    public void login(User user) {
        loginManager.login(user);
    }

    public void logout(User user) {
        loginManager.logout(user);
    }

    public void register(User user) {
        registrationManager.register(user);
    }

    public void resetPassword(User user) {
        accountManager.resetPassword(user);
    }

    public void suspendAccount(User user) {
        accountManager.suspendAccount(user);
    }

    public void activateAccount(User user) {
        accountManager.activateAccount(user);
    }
}

// Separate class to handle login and logout operations
class LoginManager {
    public void login(User user) {
        System.out.println("User " + user.getName() + " logged in.");
    }

    public void logout(User user) {
        System.out.println("User " + user.getName() + " logged out.");
    }
}

// Separate class to handle user registration
class RegistrationManager {
    public void register(User user) {
        System.out.println("User " + user.getName() + " registered.");
    }
}

// Separate class to manage account actions such as resetting password, suspending, or activating account
class AccountManager {
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

// User class with basic fields and a getter method for name
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
