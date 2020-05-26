package Konto2;

public class Girokonto2 extends Konto2{

    protected double limit;

    public Girokonto2(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void einzahlen (double wert){
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen (double wert){
        if(kontostand-wert < -limit){
            wert = kontostand + limit;
            kontostand = -limit;
            return wert;
        }
        return super.auszahlen(wert);
    }
}
