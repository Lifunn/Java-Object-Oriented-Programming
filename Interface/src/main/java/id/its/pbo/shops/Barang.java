package id.its.pbo.shops;

public abstract class Barang {
    private String merk;

    public Barang(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }
}
