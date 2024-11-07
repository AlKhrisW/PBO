package UTS;

public class PemegangSaham extends Manajer{
    public int deviden;
    public int jumSaham;
    public void setJumSaham(int jumSaham) {
        this.jumSaham = jumSaham;
    }
    public void setDeviden() {
        deviden = jumSaham * 100;
    }
    public void tampilDataPemegangSaham() {
        System.out.println("No Induk            : " + getNoIndukPegawai());
        System.out.println("Nama                : " + getNama());
        System.out.println("Gaji Pokok          : " + gaji);
        System.out.println("Tunjangan Jabatan   : " + getTunjanganJabatan());
        System.out.println("Total Gaji          : " + (gaji + getTunjanganJabatan()));
        System.out.println("Deviden             : " + deviden);
        System.out.println("Jum Saham           : " + jumSaham);
        System.out.println("Total Gaji          : " + (gaji + getTunjanganJabatan() + deviden));
    }
}