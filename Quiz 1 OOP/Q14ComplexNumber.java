package Quiz;

public class Q14ComplexNumber {
    private int a;
    private int b;
    private int c;
    private int d;

    public Q14ComplexNumber(int a, int bi, int c, int di){
        this.a = a;
        this.b = bi;
        this.c = c;
        this.d = di;
    }
    public String add(){
        int num = (a + c);
        int komplex = (b + d);
        return num + " + " + komplex + "i";
    }

    public String Subtrac(){
        int num = (a - c);
        int komplex = (b - d);
        return num + " + " + komplex + "i";
    }

    public String Mul(){
        int num = ((a * c)-(b * d));
        int komplex = ((a * d)+(b * c));
        return num + " + " + komplex + "i";
    }
}
