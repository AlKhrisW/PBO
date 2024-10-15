public class Mesin {
    private String merek;
    private double kecepatan = 0;
    public Mesin() {

    }
    public void setMerek(String merekMesin) {
        this.merek = merekMesin;
    }
    public String getMerek() {
        return merek;
    }
    public double getkecepatan() {
        return kecepatan;
    }
    public void tambahKecepatan() {
        if (merek.equalsIgnoreCase("Honda") && kecepatan <= 100) {
            kecepatan += 10;
        } else if(merek.equalsIgnoreCase("Yamaha") && kecepatan <= 100) {
            kecepatan += 15;
        }
    }
    public void kurangiKecepatan() {
        if (merek.equals("Honda") && kecepatan > 0) {
            kecepatan -= 5;
        } else if(merek.equals("Yamaha") && kecepatan > 0) {
            kecepatan -= 10;
        }
    }
}
