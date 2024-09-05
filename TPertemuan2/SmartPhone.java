package TPertemuan2;

public class SmartPhone {
    public String merek, jenis, warna, koneksi, jenisLayar, jenisSpeaker;
    public int ram, rom, jumlahKamera, resolusiKamera, ukuranLayar, refreshRate;
    public void setDataString(String m, String j, String w, String k, String jl, String js) {
        merek = m;
        jenis = j;
        warna = w;
        koneksi = k;
        jenisLayar = jl;
        jenisSpeaker = js;
    }
    public void setDataInt(int rm, int om, int jk, int rk, int ul, int rr) {
        ram = rm;
        rom = om;
        jumlahKamera = jk;
        resolusiKamera = rk;
        ukuranLayar = ul;
        refreshRate = rr;
    }
    public void menyalakan() {
        System.out.println("Layar menyala");
    }
    public void mematikan() {
        System.out.println("Layar mati");
    }
    public void menangkapFoto(int value) {
        rom = rom - (value * 3);
    }
    public void menangkapVideo(int value) {
        rom = rom - (value * 5);
    }
    public void membukaApk() {
        System.out.println("Aplikasi dibuka");
    }
    public void menelpon() {
        System.out.println("Menghubungi .......");
    }
    public void cetakStatus() {
        System.out.println("Merek               : " + merek);
        System.out.println("Jenis               : " + jenis);
        System.out.println("Warna               : " + warna);
        System.out.println("Ram                 : " + ram + " GB");
        System.out.println("Rom                 : " + rom + " MB");
        System.out.println("Koneksi             : " + koneksi);
        System.out.println("Jumlah Kamera       : " + jumlahKamera);
        System.out.println("Resolusi Kamera     : " + resolusiKamera + " mp");
        System.out.println("Ukuran Layar        : " + ukuranLayar + " inch");
        System.out.println("Jenis Layar         : " + jenisLayar);
        System.out.println("Refresh Rate        : " + refreshRate + " hz");
        System.out.println("Jenis Speaker       : " + jenisSpeaker + "\n");
    }
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();

        s1.setDataString("Samsung", "Flip", "Warna", "4G", "Amoled", "Stereo");
        s1.setDataInt(8, 128000, 2, 100, 6, 120);
        s1.cetakStatus();

        s1.menyalakan();
        s1.menangkapFoto(1);
        s1.menangkapVideo(1);
        s1.membukaApk();
        s1.menelpon();
        s1.cetakStatus();
    }
}
