package id.its.pbo.art;

import java.util.ArrayList;
import java.util.List;

public class StudioSeni {
    private List<KaryaSeni> daftarKarya;

    public StudioSeni() {
        daftarKarya = new ArrayList<>();
    }

    public void tambahKaryaSeni(KaryaSeni karya) {
        daftarKarya.add(karya);
    }

    public List<String> tampilkanSemuaKarya() {
        List<String> caraTampilkan = new ArrayList<>();
        for (KaryaSeni karya : daftarKarya) {
            caraTampilkan.add(karya.tampilkan());
        }
        return caraTampilkan;
    }
}