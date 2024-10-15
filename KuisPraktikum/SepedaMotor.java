public class SepedaMotor {
    private Mesin mesin;
    private String merekMotor;
    public SepedaMotor(String merekMotor, String merekMesin) {
        this.merekMotor = merekMotor;
        this.mesin = new Mesin();
        mesin.setMerek(merekMesin);
    }
    public void setmerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }
    public String getMerekMotor() {
        return merekMotor;
    }
    public String getMerekMesin() {
        return mesin.getMerek();
    }
    public void tambahKecepatanMotor() {
        mesin.tambahKecepatan();
        System.out.println(mesin.getkecepatan() + " Km/jam");
    }
    public void kurangiKecepatanMotor() {
        mesin.kurangiKecepatan();
        System.out.println(mesin.getkecepatan() + " Km/jam");
    }
}
