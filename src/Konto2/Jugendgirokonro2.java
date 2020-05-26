package Konto2;

public class Jugendgirokonro2 extends Girokonto2 {

    protected double buchungslimit;

    public Jugendgirokonro2(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen (double wert){
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen (double wert){
        if(wert>buchungslimit){
             return super.auszahlen(buchungslimit);
        }
        return super.auszahlen(wert);
    }
}
