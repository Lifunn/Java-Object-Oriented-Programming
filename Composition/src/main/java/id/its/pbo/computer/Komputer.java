package id.its.pbo.computer;

public class Komputer {
    private Processor tipeProcessor;
    private Memory tipeMemory;

    public Komputer(Processor tipeProcessor, Memory tipeMemory) {
        this.tipeProcessor = tipeProcessor;
        this.tipeMemory = tipeMemory;
    }

    public String infoKomputer() {
        return "Processor Brand: " + tipeProcessor.getBrand() + ", Kecepatan: " + tipeProcessor.getKecepatan() + ", Memory Kapasitas " + tipeMemory.getKapasitas() + ", Tipe: " + tipeMemory.getTipeMemory();
    }

    public Memory getMemory() {
        return tipeMemory;
    }
    public Processor getProcessor() {
        return tipeProcessor;
    }

    public void setProcessor(Processor tipeProcessor) {
        this.tipeProcessor = tipeProcessor;
    }
    public void setMemory(Memory tipeMemory) {
        this.tipeMemory = tipeMemory;
    }
}
