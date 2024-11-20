package id.its.pbo.shops;

public class ElectricityProvider {
    public static String supplyPower(Electrifiable device) {
        return device.powerOn();
    }

}
