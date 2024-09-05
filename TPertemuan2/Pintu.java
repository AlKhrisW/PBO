package TPertemuan2;

public class Pintu {
    public String merek, jenis, warna;
    public int tinggi;
    public double lebar;
    public void setMerek(String value) {
        merek = value;
    }
    public void setWarna(String value) {
        warna = value;
    }
    public void setJenis(String value) {
        jenis = value;
    }
    public void setTinggi(int value) {
        tinggi = value;
    }
    public void setLebar(double value) {
        lebar = value;
    }
    public void membukaPintu() {
        System.out.println("Pintu dibuka");
    }
    public void menutupPintu() {
        System.out.println("Pintu ditutup");
    }
    public void cetakStatus() {
        System.out.println("Merek   : " + merek);
        System.out.println("Jenis   : " + jenis);
        System.out.println("Warna   : " + warna);
        System.out.println("Tinggi  : " + tinggi + " meter");
        System.out.println("Lebar   : " + lebar + " meter\n");
    }
    public static void main(String[] args) {
        Pintu p1 = new Pintu();

        p1.setMerek("Ujah");
        p1.setJenis("Geser");
        p1.setWarna("Biru");
        p1.setTinggi(2);
        p1.setLebar(0.75);
        p1.cetakStatus();

        p1.membukaPintu();
        p1.menutupPintu();
    }
}
