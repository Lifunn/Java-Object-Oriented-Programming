package id.its.pbo.zoo;

public class Singa extends Hewan implements BisaBersuara {
    public Singa(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "Roar";
    }
}
