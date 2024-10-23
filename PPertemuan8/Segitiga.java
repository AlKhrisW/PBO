public class Segitiga {
    public int sudut;
    public int totalSudut(int sudutA) {
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt( Math.pow(sisiA,2) + Math.pow(sisiB,2) );
        return c;
    }

    public static void main(String[] args) {
        Segitiga s1 = new Segitiga();

        System.out.println("Total sudut 1   : " + s1.totalSudut(60));
        System.out.println("Total sudut 2   : " + s1.totalSudut(50, 70));
        System.out.println("Keliling 1      : " + s1.keliling(30, 50, 70));
        System.out.printf("Keliling 2      : %.2f", s1.keliling(50, 75));
    }
}
