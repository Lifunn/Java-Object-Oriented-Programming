package id.its.pbo.music;

public class Gitar extends Instrumen {

    public Gitar(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "tring tring";
    }
}
