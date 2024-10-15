package PPertemuan3;

public class Anggota {
    private String ktp, nama;
    private int limitPeminjaman, jumlahPinjaman;

    public Anggota(String ktp, String nama, int limitPeminjaman) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public String getKtp() {
        return ktp;
    }
    public String getNama() {
        return nama;
    }
    public int getLimit() {
        return limitPeminjaman;
    }
    public void setPinjaman(int pinjam) {
        if (pinjam > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman = pinjam;
        }
    }
    public int getPinjaman() {
        return jumlahPinjaman;
    }
    public void setAngsuran(int angsuran) {
        if (angsuran >= (jumlahPinjaman * 10 / 100)) {
            jumlahPinjaman = jumlahPinjaman - angsuran;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        }
    }
}
