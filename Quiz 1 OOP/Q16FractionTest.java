package Quiz;
public class Q16FractionTest {
    public static void main(String[] args) {
        Q16Fraction a = new Q16Fraction(5, 2);
        Q16Fraction b = new Q16Fraction(7, 4);

        Q16Fraction sum = Q16Fraction.sumFraction(a, b);
        Q16Fraction mul = Q16Fraction.mulFraction(a, b);

        System.out.println("Penjumlahan: " + sum);
        System.out.println("Perkalian: " + mul);
    }
}
