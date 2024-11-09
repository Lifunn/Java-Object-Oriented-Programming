package id.its.pbo.vehicle;

import id.its.pbo.transport.Mobil;

public class KendaraanProgram {
    public static void main(String[] args) {
        Mobil wrx = new Mobil("Brio", 2004, "XYX");

        System.out.println(wrx.infoMobil());
    }
}
