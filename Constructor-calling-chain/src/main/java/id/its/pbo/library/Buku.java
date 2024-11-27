package id.its.pbo.library;

import java.util.ArrayList;
import java.util.List;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private List<Anggota> daftarPeminjam;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.daftarPeminjam = new ArrayList<>();
    }

    public void tambahPeminjam(Anggota anggota) {
        daftarPeminjam.add(anggota);
    }

    public List<Anggota> getDaftarPeminjam() {
        return daftarPeminjam;
    }

    public String getInfoBuku() {
        return judul + ", " + pengarang + ", " + tahunTerbit;
    }
}
