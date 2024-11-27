package id.its.pbo.library;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> daftarBuku;
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public void pinjamBuku(Anggota anggota, Buku buku) {
        buku.tambahPeminjam(anggota);
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public List<Anggota> getDaftarAnggota() {
        return daftarAnggota;
    }
}
