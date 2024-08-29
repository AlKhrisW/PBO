package LatihanPraktikum;

public class Bolpoin {
    private String merek, jenisTinta, panjang;
    public void setMerek(String newValue) {
        merek = newValue;
    }
    public void setTinta(String newValue) {
        jenisTinta = newValue;
    }
    public void setUkuran(String newValue) {
        panjang = newValue;
    }
    public void cetakStatus() {
        System.out.println("Merek           : " + merek);
        System.out.println("Tinta           : " + jenisTinta);
        System.out.print("Panjang         : " + panjang);
        System.out.println(" cm");
    }
}
