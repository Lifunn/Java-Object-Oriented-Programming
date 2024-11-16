package id.its.pbo.zoo;

public abstract class Hewan {
    private String nama;

    // Konstruktor
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode abstrak untuk membuat suara
    public abstract String buatSuara();
}
