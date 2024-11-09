package id.its.pbo.electronics;

import id.its.pbo.gadget.Gadget;

public class Smartphone extends Gadget {
    private String sistemOperasi;

    public Smartphone(String brand, int tahunRilis, String sistemOperasi) {
        super(brand, tahunRilis);
        this.sistemOperasi = sistemOperasi;
    }

    public String getSistemOperasi() {
        return sistemOperasi;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public String infoSmartphone(){
        return infoGadget() + ", Sistem Operasi: " + this.sistemOperasi;
    }
}
