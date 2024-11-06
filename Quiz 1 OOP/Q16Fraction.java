package Quiz;
public class Q16Fraction {
    private int pembilang;
    private int penyebut;

    public Q16Fraction(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public static Q16Fraction sumFraction(Q16Fraction a, Q16Fraction b) {
        int newPembilang = (a.pembilang * b.penyebut) + (b.pembilang * a.penyebut);
        int newPenyebut = (a.penyebut * b.penyebut);
        return new Q16Fraction(newPembilang, newPenyebut);
    }

    public static Q16Fraction mulFraction(Q16Fraction a, Q16Fraction b) {
        int newPembilang = a.pembilang * b.pembilang;
        int newPenyebut = a.penyebut * b.penyebut;
        return new Q16Fraction(newPembilang, newPenyebut);
    }

    public String toString(){
        return pembilang + "/" + penyebut;
    }
}
