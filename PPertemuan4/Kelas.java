package PPertemuan4;

public class Kelas {
    private String kelas;
    private MataKuliah mataKuliah;
    public Kelas(String kelas) {
        this.kelas = kelas;
    }
    public String getKelas() {
        return kelas;
    }
    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }
}
