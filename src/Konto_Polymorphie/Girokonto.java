package Konto_Polymorphie;

public class Girokonto extends Konto {
    protected double limit;

    public Girokonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public double auszahlen (double wertAuszahlung){
        double auszahlungshoehe = wertAuszahlung;
        if(wertAuszahlung<=(kontostand+limit)){ //wenn Auszahlungsbetrag das Konto nicht weiter als bis zum Limit belastet
        return super.auszahlen(wertAuszahlung);} //kann die Super-Methode von Basisklasse aufgerufen werden
        else{       //fall Auszahlungsbetrag das Konto über das Limit überziehen würde, kann nur bis Limit ausgezahlt werden
            System.out.println("Auszahlungslimit erreicht. Es konnten nur " + (kontostand+limit) + " € behoben werden");
            kontostand=0-limit;     //Konto wir bis limit leer geräumt
            System.out.println("Ihr aktueller Kontostand beträgt jetzt " + kontostand + " €");
        auszahlungshoehe = kontostand+limit;}   //Ausgezahlt wird der Wert der auf Konto war (kann auch neg. sein) bis Limit erreicht ist
        return auszahlungshoehe;
    }

    @Override
    public void einzahlen(double wertEinzahlung) {
        super.einzahlen(wertEinzahlung);
    }
}
