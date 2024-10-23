public class Override {
    public static void main(String[] args) {
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        m1.makan();
        m2.makan();
        m3.makan();
    }
}
