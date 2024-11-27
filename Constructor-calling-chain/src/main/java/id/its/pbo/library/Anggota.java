package id.its.pbo.library;

public class Anggota {
    private String nama;
    private String alamat;
    private String nomorAnggota;

    public Anggota(String nama, String nomorAnggota) {
        this(nama, "Alamat belum diisi", nomorAnggota);
    }

    public Anggota(String nama, String alamat, String nomorAnggota) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorAnggota = nomorAnggota;
    }

    public String getInfoAnggota() {
        return nama + ", " + alamat + ", " + nomorAnggota;
    }
}
