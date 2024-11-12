package id.its.pbo.transport;

import id.its.pbo.vehicle.Kendaraan;

public class Mobil extends Kendaraan {
    private String jenis;

    public Mobil(String merk, int tahunProduksi, String jenis) {
        super(merk, tahunProduksi);
        this.jenis = jenis;
    }

    public String infoMobil(){
        return infoKendaraan() + ", Jenis: " + this.jenis;
    }

    public String getJenis() {
        return jenis;
    }
}
