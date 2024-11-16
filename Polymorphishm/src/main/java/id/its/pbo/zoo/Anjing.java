package id.its.pbo.zoo;

public class Anjing extends Hewan {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public String buatSuara() {
        return "Guk";
    }
}
