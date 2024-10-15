package TPertemuan5.Tugas3;

public class Main {
    public static void main(String[] args) {
        Mobil ml1 = new Mobil();
        ml1.setKecepatan(60);
        ml1.setWarna("Merah");
        ml1.displayInfo();
        Becak b1 = new Becak();
        b1.setKecepatan(10);
        b1.setWarna("Kuning");
        b1.displayInfo();
        Motor mr1 = new Motor();
        mr1.setKecepatan(40);
        mr1.setWarna("Hitam");
        mr1.displayInfo();
    }
}
