package id.its.pbo.electronics;

public class TokoElektronikProgram {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk laptop = new Produk("Laptop", 7000000);
        Produk mouse = new Produk("Mouse", 150000);
        Produk keyboard = new Produk("Keyboard", 300000);

        keranjang.tambahProduk(new ItemBelanja(laptop, 1));    // 1 laptop
        keranjang.tambahProduk(new ItemBelanja(mouse, 2));     // 2 mouse
        keranjang.tambahProduk(new ItemBelanja(keyboard, 1));  // 1 keyboard

        double total = keranjang.hitungTotalBelanja();
        System.out.println("Total belanja: Rp" + total);
    }
}
