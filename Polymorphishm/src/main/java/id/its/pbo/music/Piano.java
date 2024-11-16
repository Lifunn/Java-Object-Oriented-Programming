package id.its.pbo.music;

public class Piano extends Instrumen {

    public Piano(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "tink tink";
    }
}
