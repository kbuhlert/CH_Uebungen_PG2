package Himmelsrichtung;

public class Tuer {
    private double breite;
    private double hoehe;
    private Himmelsrichtung tueroeffnung;


    public Tuer(double breite, double hoehe, Himmelsrichtung tueroeffnung) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.tueroeffnung = tueroeffnung;
    }

    public double getBreite() {
        return breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public Himmelsrichtung getTueroeffnung() {
        return tueroeffnung;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public void setTueroeffnung(Himmelsrichtung tueroeffnung) {
        this.tueroeffnung = tueroeffnung;
    }
}
