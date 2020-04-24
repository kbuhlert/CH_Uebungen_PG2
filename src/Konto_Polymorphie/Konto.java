package Konto_Polymorphie;

public class Konto {
protected String inhaber;
protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        kontostand = 0;
    }
    public void einzahlen (double wertEinzahlung){
        kontostand = kontostand + wertEinzahlung;
        System.out.println("Einzahlung: " + wertEinzahlung + " €. Ihr aktueller Kontostand beträgt jetzt " + kontostand + " €");
    }

    public double auszahlen (double wertAuszahlung){
        kontostand = kontostand - wertAuszahlung;
        double auszahlungshoehe = wertAuszahlung;
        System.out.println("Sie haben " + auszahlungshoehe + " € behoben");
        System.out.println("Ihr aktueller Kontostand beträgt jetzt " + kontostand + " €");
        return auszahlungshoehe;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        System.out.println(kontostand);
        return kontostand;
    }
}
