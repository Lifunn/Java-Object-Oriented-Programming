package id.its.pbo.perusahaan;

public class Manager extends Karyawan {
    private String departemen;

    public Manager(String nama, String id, String departemen) {
        super(nama, id);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
}
