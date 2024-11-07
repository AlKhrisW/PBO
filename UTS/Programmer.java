package UTS;

public class Programmer extends Pegawai{
    private int bonus;
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }
    public void tampilDataProgrammer() {
        System.out.println("No Induk    : " + getNoIndukPegawai());
        System.out.println("Nama        : " + getNama());
        System.out.println("Gaji Pokok  : " + gaji);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Total Gaji  : " + (gaji + bonus));
    }
}