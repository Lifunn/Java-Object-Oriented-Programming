package id.its.pbo.zoo;

public class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public String buatSuara() {
        return "Meong";
    }
}
