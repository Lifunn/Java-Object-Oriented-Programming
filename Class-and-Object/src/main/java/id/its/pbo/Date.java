package id.its.pbo;

public class Date {
	private int month;
    private int day;
    private int year;
    
 // Constructor
    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    // Setter 
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1; 
        }
    }

    public void setDay(int day) {
        if (day >= 1 && day <= getMaxDaysInMonth(this.month, this.year)) {
            this.day = day;
        } else {
            this.day = 1; 
        }
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            this.year = 0; 
        }
    }

    // Getter 
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Metode untuk mendapatkan jumlah hari maksimal dalam bulan tertentu
    private int getMaxDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (isLeapYear(year)) ? 29 : 28;
            default:
                return 31;
        }
    }

    // Metode untuk memeriksa apakah suatu tahun adalah tahun kabisat
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Metode untuk menampilkan tanggal dalam format "bulan/hari/tahun"
    public String displayDate() {
        return month + "/" + day + "/" + year;
    }
}
