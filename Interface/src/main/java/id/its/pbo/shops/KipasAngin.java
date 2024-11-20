package id.its.pbo.shops;

public class KipasAngin extends Barang implements Electrifiable {
    public KipasAngin(String merk) {
        super(merk);
    }

    @Override
    public String powerOn() {
        return "Kipas Angin dinyalakan";
    }

    @Override
    public String powerOff() {
        return "Kipas Angin dimatikan";
    }
}
