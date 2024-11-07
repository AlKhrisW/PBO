package TPertemuan7.Tugas1;

public class Warna extends Merek{
    public String warna;
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void displayInfo() {
        System.out.println("Jenis Kendaraan     : " + jenis);
        System.out.println("Jenis Sepeda Motor  : " + jenisSepeda);
        System.out.println("Merek Sepeda Motor  : " + merek);
        System.out.println("Warna Sepeda Motor  : " + warna);
    }
}
