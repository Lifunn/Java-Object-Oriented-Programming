package id.its.pbo.music;

public class StudioMusikProgram {
    public static void main(String[] args) {
        // Membuat objek StudioMusik
        StudioMusik studio = new StudioMusik();

        // Menambahkan instrumen ke dalam daftar
        Instrumen gitar = new Gitar("Gitar Akustik");
        Instrumen piano = new Piano("Piano Grand");

        studio.tambahInstrumen(gitar);
        studio.tambahInstrumen(piano);

        // Menampilkan suara dari semua instrumen
        System.out.println(studio.mainkanInstrumen());
    }
}
