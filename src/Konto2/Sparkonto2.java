package Konto2;

public class Sparkonto2 extends Konto2 {

    public Sparkonto2(String inhaber) {
        super(inhaber);
    }

    @Override
    public void einzahlen (double wert){
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if(kontostand-wert<0){
            wert = kontostand;
            kontostand = 0;
            super.auszahlen(wert);
        }
        return super.auszahlen(wert);
    }
}
