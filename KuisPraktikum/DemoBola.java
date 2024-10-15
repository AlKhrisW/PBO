public class DemoBola {
    public static void main(String[] args) {
        Bola b1 = new Bola(20);
        Bola b2 = new Bola(100);

        b1.hitungLuasPermukaan();
        b1.hitungVolume();
        
        System.out.println("Bola 1");
        System.out.println("Diameter        : " + b1.getDiameter());
        System.out.println("Jari-jari       : " + b1.getJariJari());
        System.out.printf("Phi             : %.2f\n", b1.getPhi());
        System.out.printf("Luas Permukaan  : %.2f\n", b1.getLuasPermukaan());
        System.out.printf("Volume          : %.2f\n", b1.getVolume());

        b2.hitungLuasPermukaan();
        b2.hitungVolume();

        System.out.println("Bola 2");
        System.out.println("Diameter        : " + b2.getDiameter());
        System.out.println("Jari-jari       : " + b2.getJariJari());
        System.out.printf("Phi             : %.2f\n", b2.getPhi());
        System.out.printf("Luas Permukaan  : %.2f\n", b2.getLuasPermukaan());
        System.out.printf("Volume          : %.2f\n", b2.getVolume());
    }
}
