package UTS;

public class Manajer extends Pegawai{
    private int tunjanganJabatan;
    public void setTunjanganJabatan(int tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }
    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }
    public void tampilDataManajer() {
        System.out.println("No Induk            : " + getNoIndukPegawai());
        System.out.println("Nama                : " + getNama());
        System.out.println("Gaji Pokok          : " + gaji);
        System.out.println("Tunjangan Jabatan   : " + tunjanganJabatan);
        System.out.println("Total Gaji          : " + (gaji + tunjanganJabatan));
    }
}
