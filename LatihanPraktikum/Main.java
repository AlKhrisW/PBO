package LatihanPraktikum;

public class Main {
    public static void main(String[] args) {
        Bolpoin blp1 = new Bolpoin();
        Bolpoin blp2 = new Bolpoin();
        BolpoinWarna blp3 = new BolpoinWarna();
        DrawingPen blp4 = new DrawingPen();

        blp1.setMerek("Standard");
        blp1.setTinta("Cair");
        blp1.setUkuran("15");
        blp1.cetakStatus();
        
        System.out.println();

        blp2.setMerek("Zuixua");
        blp2.setTinta("Gel");
        blp2.setUkuran("15");
        blp2.cetakStatus();

        System.out.println();

        blp3.setMerek("Standard");
        blp3.setTinta("Cair");
        blp3.setUkuran("15");
        blp3.setJenis("Mono-color");
        blp3.setWarnaTinta("Merah");
        blp3.cetakStatus();

        System.out.println();

        blp4.setMerek("Artline");
        blp4.setTinta("Cair");
        blp4.setUkuran("14");
        blp4.setUjung("0.8");
        blp4.setWarna("Coklat");
        blp4.cetakStatus();
    }
}
