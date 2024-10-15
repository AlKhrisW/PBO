public class DemoAlatTulis {
    public static void main(String[] args) {
        AlatTulis al1 = new AlatTulis();
        AlatTulis al2 = new AlatTulis();
        AlatTulis al3 = new AlatTulis();

        // al1.setData("bolpoint", 10, 2000);
        // al2.setData("pensil", 10, 1000);
        // al3.setData("penghapus", 10, 500);

        al1.setNama("bolpoint");
        al1.setStok(10);
        al1.setHargaSatuan(2000);
        al1.setHarga();

        al2.setNama("pensil");
        al2.setStok(10);
        al2.setHargaSatuan(1000);
        al2.setHarga();

        al3.setNama("penghapus");
        al3.setStok(10);
        al3.setHargaSatuan(500);
        al3.setHarga();

        System.out.println("Nama        : " + al1.getNama());
        System.out.println("Stok        : " + al1.getStok());
        System.out.println("Harga Satuan: " + al1.getHargaSatuan());
        System.out.println("Harga       : " + al1.getHarga() + "\n");

        System.out.println("Nama        : " + al2.getNama());
        System.out.println("Stok        : " + al2.getStok());
        System.out.println("Harga Satuan: " + al2.getHargaSatuan());
        System.out.println("Harga       : " + al2.getHarga() + "\n");

        System.out.println("Nama        : " + al3.getNama());
        System.out.println("Stok        : " + al3.getStok());
        System.out.println("Harga Satuan: " + al3.getHargaSatuan());
        System.out.println("Harga       : " + al3.getHarga() + "\n");

        System.out.println("Total Harga: " + al1.setgetTotalHarga(al1.getHarga(), al2.getHarga(), al3.getHarga()));
    }
}
