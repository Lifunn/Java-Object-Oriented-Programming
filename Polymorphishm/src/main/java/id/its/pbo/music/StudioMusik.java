package id.its.pbo.music;

import java.util.ArrayList;
import java.util.List;

public class StudioMusik {
    private List<Instrumen> daftarInstrumen;

    // Konstruktor
    public StudioMusik() {
        daftarInstrumen = new ArrayList<>();
    }

    // Metode untuk menambahkan instrumen ke daftar
    public void tambahInstrumen(Instrumen instrumen) {
        daftarInstrumen.add(instrumen);
    }

    // Metode untuk memainkan semua instrumen
    public String mainkanInstrumen() {
        StringBuilder suaraSemuaInstrumen = new StringBuilder();
        for (Instrumen instrumen : daftarInstrumen) {
            suaraSemuaInstrumen.append(instrumen.getNama()).append(": ").append(instrumen.suara()).append("\n");
        }
        return suaraSemuaInstrumen.toString();
    }
}
