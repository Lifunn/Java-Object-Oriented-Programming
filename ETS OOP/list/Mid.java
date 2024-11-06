package list;

public class Mid extends List {

    // 8
    static List negateAll(List inputList) {
        if (inputList.empty()) {
            return List.nil();  // Basis rekursi: jika list kosong, kembalikan list kosong
        } else {
            // Rekursi: negate head dan lanjutkan dengan tail
            return List.cons(-inputList.head(), negateAll(inputList.tail()));
        }
    }

    // 9
    static int find(int target, List inputList) {
        return findHelper(target, inputList, 0); // Memulai pencarian dari indeks 0
    }
    
    static int findHelper(int target, List inputList, int currentIndex) {
        if (inputList.empty()) {
            return -1; // Jika list kosong, elemen tidak ditemukan
        } else if (inputList.head() == target) {
            return currentIndex; // Jika elemen ditemukan, kembalikan indeksnya
        } else {
            return findHelper(target, inputList.tail(), currentIndex + 1); // Lanjutkan pencarian di tail dengan indeks berikutnya
        }
    }

    // 10
    static boolean allPositive(List inputList) {
        if (inputList.empty()) {
            return true;  // Basis rekursi: jika list kosong, dianggap semua positif
        } else if (inputList.head() < 0) {
            return false; // Jika ditemukan elemen negatif, langsung kembalikan false
        } else {
            return allPositive(inputList.tail()); // Lanjutkan pengecekan di tail
        }
    }

    // 11
    static List positives(List inputList) {
        if (inputList.empty()) {
            return List.nil();  // Basis rekursi: jika list kosong, kembalikan list kosong
        } else if (inputList.head() >= 0) {
            // Jika elemen positif atau nol, tambahkan ke hasil dan lanjutkan ke tail
            return List.cons(inputList.head(), positives(inputList.tail()));
        } else {
            // Jika elemen negatif, abaikan dan lanjutkan ke tail
            return positives(inputList.tail());
        }
    }

    // 12
    static boolean sorted(List inputList) {
        if (inputList.empty() || inputList.tail().empty()) {
            return true;  // Basis rekursi: jika list kosong atau hanya 1 elemen, dianggap terurut
        } else if (inputList.head() > inputList.tail().head()) {
            return false; // Jika elemen pertama lebih besar dari elemen berikutnya, tidak terurut
        } else {
            return sorted(inputList.tail()); // Lanjutkan memeriksa bagian ekor (tail) dari list
        }
    }
    
    // 13
    static List merge(List listA, List listB) {
        if (listA.empty()) {
            return listB;  // Basis rekursi: jika list A kosong, kembalikan list B
        } else if (listB.empty()) {
            return listA;  // Basis rekursi: jika list B kosong, kembalikan list A
        } else if (listA.head() <= listB.head()) {
            // Jika elemen pertama di A lebih kecil atau sama dengan elemen pertama di B, masukkan elemen dari A
            return List.cons(listA.head(), merge(listA.tail(), listB));
        } else {
            // Jika elemen pertama di B lebih kecil, masukkan elemen dari B
            return List.cons(listB.head(), merge(listA, listB.tail()));
        }
    }

    // 14
    static List removeDuplicate(List inputList) {
        if (inputList.empty()) {
            return List.nil();  // Basis rekursi: jika list kosong, kembalikan list kosong
        } else {
            // Buat list baru dengan elemen pertama, lalu hilangkan duplikat pada tail
            return List.cons(inputList.head(), removeDuplicate(skip(inputList.head(), inputList.tail())));
        }
    }
    
    // 15
    static List skip(int value, List inputList) {
        if (inputList.empty()) {
            return List.nil();  // Basis rekursi: jika list kosong, kembalikan list kosong
        } else if (inputList.head() == value) {
            // Jika elemen sekarang sama dengan x, skip elemen ini dan lanjutkan ke tail
            return skip(value, inputList.tail());
        } else {
            // Jika tidak, tambahkan elemen sekarang ke hasil dan lanjutkan rekursi
            return List.cons(inputList.head(), skip(value, inputList.tail()));
        }
    }
}
