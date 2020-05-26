package Konto_Polymorphie;

public class KontoApp {
    public static void main(String[] args) {
        Jugendgirokonto heinzisKonto = new Jugendgirokonto("Heinzi",200.0,250.0);
        heinzisKonto.einzahlen(200.0);
        heinzisKonto.auszahlen(300);
        heinzisKonto.auszahlen(450.0);

        System.out.println("----upcasten Jugenkonto in Konto ------");
        Konto heinzisEchtesKonto = (Konto)heinzisKonto;
        heinzisEchtesKonto.getKontostand();
        heinzisEchtesKonto.auszahlen(600.0);    //das neue Objekt "heinzisEchtesKonto" der Klasse Konto behält Eigenschaften von Jugendgirokonto

    }
}
