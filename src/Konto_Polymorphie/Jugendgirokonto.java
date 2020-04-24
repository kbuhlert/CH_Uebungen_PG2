package Konto_Polymorphie;

public class Jugendgirokonto extends Girokonto{
    protected double buchungslimit;

    public Jugendgirokonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wertEinzahlung) {
        super.einzahlen(wertEinzahlung);
    }

    //Zum Überziehungslimit (limit) kommt ein Limit für die Buchungshöhe dazu
   @Override
    public double auszahlen(double wertAuszahlung) {
        if(wertAuszahlung<=buchungslimit){      //wenn Abhebehöhe kleiner als Buchungslimit
        return super.auszahlen(wertAuszahlung);} //dann wird in der super-Methode dieser Wert geprüft, ob eine Abbuchung
                                                //das Kontolimit überschreitet (dann wird nur bis Limit ausgezahlt)
                                                //ansonsten wird der gewünschte Abbuchungsbetrag ausgezahlt
        else {
            return super.auszahlen(buchungslimit);//wenn der gewünschte Abhebebetrag das Buchungslimit überschreitet wird
                                                //nur bis zum Buchungslimit ausgezahlt. Dieser Wert (Buchungslimit) wird an
                                                // super-Methode übergeben und mit diesem Wert wird in der Methode auch wieder geprüft,
                                                //ob bei Auszahlung, das Kontolimit überschritten werden würde
        }
    }
}
