package PPertemuan4;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Aldo Khrisna", "234176", "Sistem Informasi Bisnis");
        Mahasiswa m2 = new Mahasiswa("Arimbi Putri", "234197", "Teknik Informatika");
        Kelas k1 = new Kelas("TI-2A");
        Kelas k2 = new Kelas("SIB-2A");
        Dosen d1 = new Dosen("AF", "Aldo Febriansyah");
        Dosen d2 = new Dosen("HF", "Husein Fadhlullah");
        MataKuliah mk1 = new MataKuliah("Pemrograman Berbasis Objek");
        MataKuliah mk2 = new MataKuliah("Rekayasa Perangkat Lunak");

        m1.setKelas(k1);
        m2.setKelas(k2);

        mk1.setDosen(d1);
        mk2.setDosen(d2);

        k1.setMataKuliah(mk1);
        k2.setMataKuliah(mk2);

        System.out.println("NIM Mahasiswa   : " + m1.getNim());
        System.out.println("Nama Mahasiswa  : " + m1.getNamaMahasiswa());
        System.out.println("Jurusan         : " + m1.getJurusan());
        System.out.println("Kelas           : " + m1.getKelas().getKelas());
        System.out.println("Mata Kuliah     : " + m1.getKelas().getMataKuliah().getMataKuliah());
        System.out.println("Kode Dosen      : " + m1.getKelas().getMataKuliah().getDosen().getKodeDosen());
        System.out.println("Nama Dosen      : " + m1.getKelas().getMataKuliah().getDosen().getNamaDosen());

        System.out.println("=============================================");
        
        System.out.println("NIM Mahasiswa   : " + m2.getNim());
        System.out.println("Nama Mahasiswa  : " + m2.getNamaMahasiswa());
        System.out.println("Jurusan         : " + m2.getJurusan());
        System.out.println("Kelas           : " + m2.getKelas().getKelas());
        System.out.println("Mata Kuliah     : " + m2.getKelas().getMataKuliah().getMataKuliah());
        System.out.println("Kode Dosen      : " + m2.getKelas().getMataKuliah().getDosen().getKodeDosen());
        System.out.println("Nama Dosen      : " + m2.getKelas().getMataKuliah().getDosen().getNamaDosen());
    }
}
