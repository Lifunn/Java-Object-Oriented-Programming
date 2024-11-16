package id.its.pbo.art;

public abstract class KaryaSeni {
    protected String judul;

    public KaryaSeni(String judul) {
        this.judul = judul;
    }

    public abstract String deskripsi();
    public abstract String tampilkan();
}