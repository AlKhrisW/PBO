package UTS;

public class Pegawai {
    private String noIndukPegawai;
    private String nama;
    public int gaji;

    public void setNoIndukPegawai(String noIndukPegawai) {
        this.noIndukPegawai = noIndukPegawai;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public String getNoIndukPegawai() {
        return noIndukPegawai;
    }
    public String getNama() {
        return nama;
    }
    public void tampilDataPokokPegawai() {
        System.out.println("No Induk    : " + noIndukPegawai);
        System.out.println("Nama        : " + nama);
        System.out.println("Gaji Pokok  : " + gaji);
    }
}
