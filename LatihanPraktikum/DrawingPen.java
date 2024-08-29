package LatihanPraktikum;

public class DrawingPen extends Bolpoin{
    private String ujung, warna;
    public void setUjung(String newValue) {
        ujung = newValue;
    }
    public void setWarna(String newValue) {
        warna = newValue;
    }
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Warna Tinta     : " + warna);
        System.out.print("Ketebalan Ujung : " + ujung);
        System.out.println(" mm");
    }
}
