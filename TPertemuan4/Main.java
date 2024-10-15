public class Main {
    public static void main(String[] args) {
        Sopir s1 = new Sopir();
        Mobil m1 = new Mobil();
        Pelanggan p1 = new Pelanggan();

        s1.setNama("Aldo");
        s1.setBiaya(200000);

        m1.setNama("Toyota");
        m1.setBiaya(600000);

        p1.setNama("Khrisna");
        p1.setSopir(s1);
        p1.setMobil(m1);
        p1.setHari(5);

        System.out.println("Nama Pelanggan: " + p1.getNama());
        System.out.println("Mobil yang disewa: " + p1.getMobil().getNama());
        System.out.println("Sopir yang disewa: " + p1.getSopir().getNama());
        System.out.println("Hari sewa: " + p1.getHari());
        System.out.println("Total biaya: " + p1.hitungBiayaTotal());
    }
}
