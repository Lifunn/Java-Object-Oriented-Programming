package id.its.pbo.shops;

public class MobilListrik extends Barang implements Electrifiable {
    public MobilListrik(String merk) {
        super(merk);
    }

    @Override
    public String powerOn() {
        return "Mobil Listrik siap berjalan";
    }

    @Override
    public String powerOff() {
        return "Mobil Listrik berhenti";
    }
}
