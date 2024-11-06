package Quiz;

public class Q13ComputerAccount {
    private String name;
    private String username;
    private String password;

    public Q13ComputerAccount(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
    
    public void getInfo() {
        System.out.println("Real Name: " + this.name);
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("========================================");
    }
}
