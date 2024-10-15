package PPertemuan4;

public class Mahasiswa {
    private String namaMahasiswa;
    private String nim;
    private String jurusan;
    private Kelas kelas;
    public Mahasiswa(String namaMahasiswa, String nim, String jurusan) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }
    public Kelas getKelas() {
        return kelas;
    }
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }
    public String getNim() {
        return nim;
    }
    public String getJurusan() {
        return jurusan;
    }
}
