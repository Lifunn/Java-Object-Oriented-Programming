package id.its.pbo.store;

import java.util.ArrayList;
import java.util.List;

public class TokoBuku {
    private List<Buku> daftarBuku;

    public TokoBuku() {
        daftarBuku = new ArrayList<Buku>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void hapusBuku(Buku buku) {
        daftarBuku.remove(buku);
    }

    public Buku cariBuku(String isbn) {
        for (Buku buku : daftarBuku){
            if (buku.getIsbn().equals(isbn)){
               return buku;
            }
        }
        return null;
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}
