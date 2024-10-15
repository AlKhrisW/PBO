package PPertemuan3;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota    : " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + anggota1.getLimit());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.setPinjaman(10000000);
        System.out.println("jumlah pinjaman saat ini: " + anggota1.getPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.setPinjaman(4000000);
        System.out.println("jumlah pinjaman saat ini: " + anggota1.getPinjaman());

        System.out.println("\nMembayar angsuran 200.000");
        anggota1.setAngsuran(200000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        anggota1.setAngsuran(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.setAngsuran(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getPinjaman());
    }
}
