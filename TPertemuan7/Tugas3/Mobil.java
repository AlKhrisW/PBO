package TPertemuan5.Tugas3;

public class Mobil extends Kendaraan{
    public String warna;
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void displayInfo() {
        System.out.println("Kecepatan Mobil : " + kecepatan + " Km/jam");
        System.out.println("Warna Mobil     : " + warna);
    }
}
