package id.its.pbo.zoo;

public class KebunBinatangProgram {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Mimi");
        Hewan anjing = new Anjing("Bobby");

        System.out.println(kucing.getNama() + " bersuara: " + kucing.buatSuara());
        System.out.println(anjing.getNama() + " bersuara: " + anjing.buatSuara());
    }
}
