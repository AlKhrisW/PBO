public class Bola {
    private double diameter;
    private double jariJari;
    private double phi;
    private double luasPermukaan;
    private double volume;
    public Bola(double diameter) {
        this.diameter = diameter;
        this.jariJari = diameter / 2;
        this.phi = 22.0/7;
    }
    public double getDiameter() {
        return diameter;
    }
    public double getJariJari() {
        return jariJari;
    }
    public double getPhi() {
        return phi;
    }
    public void hitungLuasPermukaan() {
        luasPermukaan = 4.0 * phi * jariJari * jariJari;
    }
    public void hitungVolume() {
        volume = (4.0 / 3.0) * phi * jariJari * jariJari * jariJari;
    }
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    public double getVolume() {
        return volume;
    }
}
