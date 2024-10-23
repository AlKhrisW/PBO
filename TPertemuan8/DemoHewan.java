package TPertemuan8;

public class DemoHewan {
    public static void main(String[] args) {
        Hewan h1 = new Hewan("Singa");
        Hewan h2 = new Hewan(2, "Ayam");
        Hewan h3 = new Hewan("Bebek", 2);
        Hewan h4 = new Hewan("Kucing", 4, "Omnivora");
        System.out.println("Nama Hewan: " + h1.getNamaHewan());

        System.out.println("Nama Hewan: " + h2.getNamaHewan());
        System.out.println("Jumlah Kaki: " + h2.getJumlahKaki());
        
        System.out.println("Nama Hewan: " + h3.getNamaHewan());
        System.out.println("Jumlah Kaki: " + h3.getJumlahKaki());

        System.out.println("Nama Hewan: " + h4.getNamaHewan());
        System.out.println("Jumlah Kaki: " + h4.getJumlahKaki());
        System.out.println("jenis Hewan: " + h4.getJenisHewan());
    }
}
