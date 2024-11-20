package id.its.pbo.shops;

public class TokoBarangProgram {
    public static void main(String[] args) {
        Televisi tv = new Televisi("Samsung");
        KipasAngin kipas = new KipasAngin("Panasonic");
        MobilListrik mobil = new MobilListrik("Tesla");

        ElectricityProvider.supplyPower(tv);
        ElectricityProvider.supplyPower(kipas);
        ElectricityProvider.supplyPower(mobil);
    }
}
