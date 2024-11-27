package id.its.pbo.perusahaan;

public class Direktur extends Manager {
    private double gaji;

    public Direktur(String nama, String id, String departemen, double gaji) {
        super(nama, id, departemen);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }
}
