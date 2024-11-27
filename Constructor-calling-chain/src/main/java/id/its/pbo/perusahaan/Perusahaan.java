package id.its.pbo.perusahaan;

public class Perusahaan {
    public static void main(String[] args) {
        Direktur direktur = new Direktur("Budi Budal", "D001", "Teknologi", 50000000.0);

        System.out.println("Nama: " + direktur.getNama());
        System.out.println("ID: " + direktur.getId());
        System.out.println("Departemen: " + direktur.getDepartemen());
        System.out.println("Gaji: Rp " + direktur.getGaji());
    }
}
