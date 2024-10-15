package PPertemuan2;

public class TempatPensilDemo {
    public static void main(String[] args) {
        TempatPensil tp1 = new TempatPensil();
        TempatPensil tp2 = new TempatPensil();

        tp1.merek = "HeyLook";
        tp1.jenis = "Kain";
        tp1.warna = "Hitam";
        tp1.jumlahKompartemen = 2;
        tp1.jumlahBarang = 7;
        tp1.cetakStatus();

        tp1.membuka();
        tp1.mengeluarkan(5);
        tp1.menutup();
        tp1.cetakStatus();
        
        System.out.println("========================================================");

        tp2.merek = "Joyko";
        tp2.jenis = "Plastik";
        tp2.warna = "Hitam";
        tp2.jumlahKompartemen = 1;
        tp2.jumlahBarang = 3;
        tp2.cetakStatus();

        tp2.membuka();
        tp2.menyimpan(1);
        tp2.menutup();
        tp2.cetakStatus();

    }
}
