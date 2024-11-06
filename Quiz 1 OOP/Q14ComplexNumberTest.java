package Quiz;

public class Q14ComplexNumberTest {
    public static void main(String[] args) {
        Q14ComplexNumber Complex = new Q14ComplexNumber(2,3,2,5);
        System.out.println("(2 + 3i) + (2 + 5i)" + " = " + Complex.add());
        System.out.println("(2 + 3i) - (2 + 5i)" + " = " + Complex.Subtrac());
        System.out.println("(2 + 3i) x (2 + 5i)" + " = " + Complex.Mul());
    }
}
