package id.its.pbo;

public class DateProgram {

	public static void main(String[] args) {
		Date date1 = new Date(12, 31, 2023);
        Date date2 = new Date(2, 29, 2024); // Tahun kabisat
        Date date3 = new Date(2, 30, 2023); // Tahun bukan kabisat, hari invalid
        Date date4 = new Date(13, 15, -5);  // Bulan dan tahun invalid

        // Menampilkan tanggal dari masing-masing objek
        System.out.println("Date 1: " + date1.displayDate());
        System.out.println("Date 2: " + date2.displayDate());
        System.out.println("Date 3: " + date3.displayDate());
        System.out.println("Date 4: " + date4.displayDate());

	}

}
