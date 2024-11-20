package id.its.pbo.shops;

public class Televisi extends Barang implements Electrifiable {
    public Televisi(String merk) {
        super(merk);
    }

    @Override
    public String powerOn() {
        return "Televisi dinyalakan";
    }

    @Override
    public String powerOff() {
        return "Televisi dimatikan";
    }
}
