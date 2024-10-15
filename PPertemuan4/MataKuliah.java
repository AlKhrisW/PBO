package PPertemuan4;

public class MataKuliah {
    private String mataKuliah;
    private Dosen dosen;
    public MataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public String getMataKuliah() {
        return mataKuliah;
    }
    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
    public Dosen getDosen() {
        return dosen;
    }
}
