package id.its.pbo.zoo;

public class KebunBinatangProgram {
    public static void main(String[] args) {
        KebunBinatang kebun = new KebunBinatang();

        kebun.tambahHewan(new Singa("Leo"));
        kebun.tambahHewan(new Kuda("Spirit"));
        kebun.tambahHewan(new Ular("Python"));

        kebun.tampilkanHewanBersuara();
    }
}
