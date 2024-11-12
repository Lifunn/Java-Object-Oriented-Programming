package id.its.pbo.store;

public class TokoBukuProgram {
    public static void main(String[] args) {
        Buku a = new Buku("1", "Nanti Kita Cerita Tentang Hari Ini", 50.000);
        Buku b = new Buku("2", "Koala Kumal", 54.000);
        Buku c = new Buku("3", "Bob Sadino", 30.000);

        TokoBuku z = new TokoBuku();
        z.tambahBuku(a);
        z.tambahBuku(b);
        z.tambahBuku(c);
        System.out.println("sebelum di hapus");
        for (Buku buku : z.getDaftarBuku()){
            System.out.println(buku.getJudul());
        }
        System.out.println("Cari Buku");
        System.out.println(z.cariBuku("1").getJudul());
        z.hapusBuku(c);
        System.out.println("Setelah di hapus");
        for (Buku buku : z.getDaftarBuku()){
            System.out.println(buku.getJudul());
        }
    }
}
