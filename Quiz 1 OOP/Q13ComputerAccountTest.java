package Quiz;

public class Q13ComputerAccountTest {
    public static void main(String[] args) {
        Q13ComputerAccount account = new Q13ComputerAccount("Alif As'ad", "lifun", "123");

        account.getInfo();

        account.changePassword("321");

        account.getInfo();
    }
}
