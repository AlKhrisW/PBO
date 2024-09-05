package TPertemuan2;

public class TempatPensil {
    public String merek, warna, jenis;
    public int jumlahKompartemen, jumlahBarang;
    public void setMerek(String value) {
        merek = value;
    }
    public void setWarna(String value) {
        warna = value;
    }
    public void setJenis(String value) {
        jenis = value;
    }
    public int setKompartemen(int value) {
        return jumlahKompartemen = value;
    }
    public int setBarang(int value) {
        return jumlahBarang = value;
    }
    public void membuka() {
        System.out.println("Tempat pensil dibuka");
    }
    public void menutup() {
        System.out.println("Tempat pensil ditutup\n");
    }
    public void menyimpan(int value) {
        System.out.println("Menyimpan   : " + value + " barang");
        jumlahBarang = jumlahBarang + value;
    }
    public void mengeluarkan(int value) {
        System.out.println("Mengeluarkan: " + value + " barang");
        jumlahBarang = jumlahBarang - value;
    }
    public void cetakStatus() {
        System.out.println("Merek               : " + merek);
        System.out.println("Jenis               : " + jenis);
        System.out.println("Warna               : " + warna);
        System.out.println("Jumlah Kompartemen  : " + jumlahKompartemen);
        System.out.println("Jumlah Barang       : " + jumlahBarang + "\n");
    }
    public static void main(String[] args) {
        TempatPensil tp1 = new TempatPensil();

        tp1.setMerek("HeyLook");
        tp1.setJenis("Kain");
        tp1.setWarna("Hitam");
        tp1.setKompartemen(2);
        tp1.setBarang(5);
        tp1.cetakStatus();

        tp1.membuka();
        tp1.mengeluarkan(2);
        tp1.menutup();
        tp1.cetakStatus();
    }
}
