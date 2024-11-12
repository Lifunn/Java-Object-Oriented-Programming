package id.its.pbo.computer;

public class KomputerProgram {
    public static void main(String[] args) {
        Processor a = new Processor("Fufu fafa", 99);
        Memory b = new Memory(64, "AMD");
        Komputer k = new Komputer(a, b);

        System.out.println(k.infoKomputer());
    }
}
