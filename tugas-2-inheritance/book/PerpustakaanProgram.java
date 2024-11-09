package id.its.pbo.book;

public class PerpustakaanProgram {
    public static void main(String[] args) {
        BukuFiksi toKillAMockingbird = new BukuFiksi("To Kill a Mockingbird", "Harper Lee", "Drama");
        BukuPelajaran matematikaLanjut = new BukuPelajaran("Matematika Lanjut", "Penerbit Pendidikan", "Matematika");

        toKillAMockingbird.setJudul("To Kill a Mockingbird - Special Edition");
        matematikaLanjut.setJudul("Matematika Lanjut - Edisi Kedua");

        matematikaLanjut.getSubjek();
    }
}
