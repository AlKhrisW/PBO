package PPertemuan3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setkecepatan(50);
        motor1.displayStatus();
        
        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setkecepatan(40);
        motor2.displayStatus();
        
        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setkecepatan(60);
        motor3.displayStatus();
    }
}
