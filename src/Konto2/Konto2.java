package Konto2;

public class Konto2 {
    protected String inhaber;
    protected double kontostand;

    public Konto2(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen (double wert){
        if(wert<0) return;
        kontostand += wert;
    }
    public double auszahlen (double wert){
        kontostand -= wert;
        return wert;
    }
}
