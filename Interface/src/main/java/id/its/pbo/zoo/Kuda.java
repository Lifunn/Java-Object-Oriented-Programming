package id.its.pbo.zoo;

public class Kuda extends Hewan implements BisaBersuara {
    public Kuda(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "Neigh";
    }
}
