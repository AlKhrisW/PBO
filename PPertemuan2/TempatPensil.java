package PPertemuan2;

public class TempatPensil {
    public String merek;
    public String warna;
    public String jenis;
    public int jumlahKompartemen;
    public int jumlahBarang;

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
}
