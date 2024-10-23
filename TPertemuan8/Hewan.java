package TPertemuan8;

public class Hewan {
    private String namaHewan;
    private int jumlahKaki;
    private String jenisHewan;
    public Hewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }
    public Hewan(String namaHewan, int jumlahKaki) {
        this.namaHewan = namaHewan;
        this.jumlahKaki = jumlahKaki;
    }
    public Hewan(String namaHewan, int jumlahKaki, String jenisHewan) {
        this.namaHewan = namaHewan;
        this.jumlahKaki = jumlahKaki;
        this.jenisHewan = jenisHewan;
    }
    public Hewan(int jumlahKaki, String namaHewan) {
        this.jumlahKaki = jumlahKaki;
        this.namaHewan = namaHewan;
    }
    public String getNamaHewan() {
        return namaHewan;
    }
    public int getJumlahKaki() {
        return jumlahKaki;
    }
    public String getJenisHewan() {
        return jenisHewan;
    }
}
