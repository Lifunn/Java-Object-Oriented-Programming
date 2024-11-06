package Quiz;

public class Q11Fraction {
    private int e1;
    private int e2;
    private int d1;
    private int d2;

    public Q11Fraction(int e1, int e2, int d1, int d2){
        this.e1 = e1;
        this.e2 = e2;
        this.d1 = d1;
        this.d2 = d2;
    }

    public String Sum() {
        int es = (e1 * d2) + (e2 * d1);
        int ds = (d1 * d2);
        return es + "/" + ds;
    }

    public String Muliply() {
        int es = e1 * e2;
        int ds = d1 * d2;
        return es + "/" + ds;
    }

    public static void main(String[] args) {
        Q11Fraction fraction1 = new Q11Fraction(1, 2, 1, 3);
        System.out.println("1/2 + 1/3 = " + fraction1.Sum());  
        System.out.println("1/2 * 1/3 = " + fraction1.Muliply());  

        // Test case 2: 1/3 + 3/4
        Q11Fraction fraction2 = new Q11Fraction(1, 3, 3, 4);
        System.out.println("1/3 + 3/4 = " + fraction2.Sum());  
        System.out.println("1/3 * 3/4 = " + fraction2.Muliply());  

        // Test case 3: 1/2 * 2/3
        Q11Fraction fraction3 = new Q11Fraction(1, 2, 2, 3);
        System.out.println("1/2 + 2/3 = " + fraction3.Sum());  
        System.out.println("1/2 * 2/3 = " + fraction3.Muliply());  
        // Test case 4: 1/4 * 2/3
        Q11Fraction fraction4 = new Q11Fraction(1, 4, 2, 3);
        System.out.println("1/4 + 2/3 = " + fraction4.Sum());  
        System.out.println("1/4 * 2/3 = " + fraction4.Muliply());  
    }
}
