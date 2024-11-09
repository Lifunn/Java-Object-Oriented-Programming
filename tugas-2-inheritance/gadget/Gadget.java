package id.its.pbo.gadget;

public class Gadget {
    protected String brand;
    protected int tahunRilis;

    public Gadget(String brand, int tahunRilis) {
        this.brand = brand;
        this.tahunRilis = tahunRilis;
    }

    protected String infoGadget(){
        return "Brand: " + this.brand + ", Tahun Rilis: " + this.tahunRilis;
    }

}
