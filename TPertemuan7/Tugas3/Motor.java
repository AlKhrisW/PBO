package TPertemuan7.Tugas3;

public class Motor extends Kendaraan{
    public String warna;
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void displayInfo() {
        System.out.println("Kecepatan Motor : " + kecepatan + " Km/jam");
        System.out.println("Warna Motor     : " + warna);
    }
}
