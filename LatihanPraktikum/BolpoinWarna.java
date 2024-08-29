package LatihanPraktikum;

public class BolpoinWarna extends Bolpoin {
    private String warnaTinta, jenis;
    public void setWarnaTinta(String newValue) {
        warnaTinta = newValue;
    }
    public void setJenis(String newValue) {
        jenis = newValue;
    }
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Jenis Pulpen    : " + jenis);
        System.out.println("Warna Tinta     : " + warnaTinta);
    }
}
