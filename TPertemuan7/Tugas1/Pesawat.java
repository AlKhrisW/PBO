package TPertemuan5.Tugas1;

public class Pesawat extends Kendaraan{
    public String jenisPesawat;
    public void setJenisPesawat(String jenisPesawat) {
        this.jenisPesawat = jenisPesawat;
    }
    public void displayInfo() {
        System.out.println("Jenis Transportasi  : " + jenis);
        System.out.println("Jenis Pesawat       : " + jenisPesawat);
    }
}
