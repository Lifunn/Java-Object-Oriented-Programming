package id.its.pbo.perusahaan;

public class Karyawan {
    private String nama;
    private String id;

    public Karyawan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
}
