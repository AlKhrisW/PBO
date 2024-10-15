public class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;

    // public void setData(String n, int s, int hs) {
    //     nama = n;
    //     stok = s;
    //     hargaSatuan = hs;
    //     harga = s * hs;
    // }

    public void setNama(String value) {
        nama = value;
    }

    public void setStok(int value) {
        stok = value;
    }

    public void setHargaSatuan(int value) {
        hargaSatuan = value;
    }

    public void setHarga() {
        harga = stok * hargaSatuan;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getHarga() {
        return harga;
    }

    public int setgetTotalHarga(int h1, int h2, int h3) {
        return h1 + h2 + h3;
    }
}
