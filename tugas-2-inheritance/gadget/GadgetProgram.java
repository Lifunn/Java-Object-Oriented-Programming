package id.its.pbo.gadget;

import id.its.pbo.electronics.Smartphone;

public class GadgetProgram {
    public static void main(String[] args) {
        Smartphone smartphone_1 = new Smartphone("Asus", 2022, "IOS");
        System.out.println(smartphone_1.infoSmartphone());
    }
}
