package TPertemuan5.Tugas3;

public class Becak extends Kendaraan{
    public String warna;
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void displayInfo() {
        System.out.println("Kecepatan Becak : " + kecepatan + " Km/jam");
        System.out.println("Warna Becak     : " + warna);
    }
}
