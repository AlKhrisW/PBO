package TPertemuan7.Tugas1;

public class Main {
    public static void main(String[] args) {
        Pesawat p1 = new Pesawat();
        p1.setJenis("Udara");
        p1.setJenisPesawat("Airbus A320");
        p1.displayInfo();

        System.out.println();

        Warna w1 = new Warna();
        w1.setJenis("Darat");
        w1.setJenisSepeda("Matic");
        w1.setMerek("Yamaha");
        w1.setWarna("Hitam");
        w1.displayInfo();
    }
}
