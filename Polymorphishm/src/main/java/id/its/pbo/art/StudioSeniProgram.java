package id.its.pbo.art;

public class StudioSeniProgram {
    public static void main(String[] args) {
        StudioSeni studio = new StudioSeni();

        // Menambahkan karya seni ke dalam daftar
        studio.tambahKaryaSeni(new Lukisan("Lukisan Mona Lisa"));
        studio.tambahKaryaSeni(new Patung("Patung David"));

        // Menampilkan cara menampilkan semua karya seni di daftar
        System.out.println("Cara menampilkan semua karya seni di studio:");
        for (String cara : studio.tampilkanSemuaKarya()) {
            System.out.println(cara);
        }
    }
}
