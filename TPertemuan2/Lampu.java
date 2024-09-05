package TPertemuan2;

public class Lampu {
    public String merek, jenis, warnaLampu;
    public void setMerek(String value) {
        merek = value;
    }
    public void setjenis(String value) {
        jenis = value;
    }
    public void setWarna(String value) {
        warnaLampu = value;
    }
    public void menyalakan() {
        System.out.println("Lampu menyala");
    }
    public void mematikan() {
        System.out.println("Lampu mati");
    }
    public void cetakStatus() {
        System.out.println("Merek       : " + merek);
        System.out.println("Jenis       : " + jenis);
        System.out.println("Warna LAmpu : " + warnaLampu + "\n");
    }
    public static void main(String[] args) {
        Lampu l1 = new Lampu();

        l1.setMerek("Philip");
        l1.setjenis("LED");
        l1.setWarna("Putih");
        l1.cetakStatus();

        l1.menyalakan();
        l1.mematikan();
    }
}
