package TPertemuan2;

public class AC {
    public String merek, jenis;
    public int suhu;
    public void setMerek(String value) {
        merek = value;
    }
    public void setJenis(String value) {
        jenis = value;
    }
    public void setSuhu(int value) {
        suhu = value;
    }
    public void menyalakan() {
        System.out.println("AC menyala");
    }
    public void mematikan() {
        System.out.println("AC mati");
    }
    public void menaikkanSuhu(int value) {
        suhu = suhu + value;
    }
    public void menurunkanSuhu(int value) {
        suhu = suhu - value;
    }
    public void cetakStatus() {
        System.out.println("Merek   : " + merek);
        System.out.println("Jenis   : " + jenis);
        System.out.println("Suhu    : " + suhu + "\n");
    }
    public static void main(String[] args) {
        AC a1 = new AC();

        a1.setMerek("Daikin");
        a1.setJenis("1 PK");
        a1.setSuhu(20);
        a1.cetakStatus();
        a1.menyalakan();
        a1.menaikkanSuhu(2);
        a1.cetakStatus();

    }
}
