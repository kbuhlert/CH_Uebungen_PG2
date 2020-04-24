package Konto_Polymorphie;

public class Sparkonto extends Konto{

    public Sparkonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void einzahlen(double wertEinzahlung) {
        super.einzahlen(wertEinzahlung);
    }

    //Kontoüberziehung nicht möglich, es kann  nur ausgezahlt werden, was auf Konto liegt
    @Override
    public double auszahlen(double wertAuszahlung) {
        if(kontostand - wertAuszahlung>=0){ //Wenn Der Abhebebetrag des Kontostand nicht überschreitet
        return super.auszahlen(wertAuszahlung); //Kann die Abhebemethode der Basisklasse verwendet werden
        }
        else {      //Wenn durch den Gewünschten Abhebebetrag das konto ins Minus kommen würde (wertAuzahlung > kontostand)
            System.out.println("Der gewählte Betrag überschreitet Ihren aktuellen Kontostand von " + kontostand);
            double auszahlungshoehe = kontostand;   //kann maximal das behoben werden, was auf dem Konto drauf ist
            System.out.println("Es wurden Ihnen " + auszahlungshoehe + " € ausgezahlt");
            kontostand = 0;
            System.out.println("Ihr aktueller Kontostand beträgt jetzt " + kontostand + " €");
            return auszahlungshoehe;
        }
    }
}
