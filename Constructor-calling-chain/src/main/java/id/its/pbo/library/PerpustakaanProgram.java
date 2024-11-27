package id.its.pbo.library;

public class PerpustakaanProgram {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku harryPotter = new Buku("Harry Potter", "J.K. Rowling", 1997);
        Buku theHobbit = new Buku("The Hobbit", "J.R.R. Tolkien", 1937);

        Anggota alice = new Anggota("Alice", "A001");
        Anggota bob = new Anggota("Bob", "Jl. Merdeka No. 1", "B002");

        perpustakaan.tambahBuku(harryPotter);
        perpustakaan.tambahBuku(theHobbit);

        perpustakaan.tambahAnggota(alice);
        perpustakaan.tambahAnggota(bob);

        perpustakaan.pinjamBuku(alice, harryPotter);

        System.out.println("Daftar Buku:");
        for (Buku buku : perpustakaan.getDaftarBuku()) {
            System.out.println(buku.getInfoBuku());
        }

        System.out.println("\nDaftar Anggota:");
        for (Anggota anggota : perpustakaan.getDaftarAnggota()) {
            System.out.println(anggota.getInfoAnggota());
        }

        System.out.println("\nDaftar Peminjam Buku \"Harry Potter\":");
        for (Anggota peminjam : harryPotter.getDaftarPeminjam()) {
            System.out.println(peminjam.getInfoAnggota());
        }
    }
}
