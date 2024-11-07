package UTS;

public class DemoUts {
    public static void main(String[] args) {
        PemegangSaham ps1 = new PemegangSaham();
        ps1.setNoIndukPegawai("001");
        ps1.setNama("Drogba");
        ps1.setGaji(100000);
        ps1.setTunjanganJabatan(50000);
        ps1.setJumSaham(10);
        ps1.setDeviden();
        ps1.tampilDataPemegangSaham();
    }
}
