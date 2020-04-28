package Figuren;

public class Rechteck extends Formen {
    protected double laenge;
    protected double breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double getUmfang() {
        return (2*laenge) + (2*breite);
    }

    @Override
    public double getFlaeche() {
        return laenge*breite;
    }


}
