package id.its.pbo.art;

public class Patung extends KaryaSeni {

    public Patung(String judul) {
        super(judul);
    }

    @Override
    public String deskripsi() {
        return "Sebuah objek tiga dimensi yang dibentuk";
    }

    @Override
    public String tampilkan() {
        return "Diletakkan di atas meja atau lantai";
    }
}