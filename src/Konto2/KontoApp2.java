package Konto2;

import Konto_Polymorphie.Konto;

public class KontoApp2 {

    public static void main(String[] args) {
        Jugendgirokonro2 heinzisKonto = new Jugendgirokonro2("Heinzi",200.0,350.0);
        heinzisKonto.einzahlen(200.0);
        System.out.println(heinzisKonto.getKontostand());
        heinzisKonto.auszahlen(300);
        System.out.println(heinzisKonto.getKontostand());
        heinzisKonto.einzahlen(550.0);
        System.out.println(heinzisKonto.getKontostand());
        heinzisKonto.auszahlen(300);
        System.out.println(heinzisKonto.getKontostand());
        System.out.println("----upcasten Jugenkonto in Konto ------");
        Konto2 heinzisEchtesKonto = (Konto2) heinzisKonto;
        System.out.println(heinzisKonto.getKontostand());
        heinzisEchtesKonto.auszahlen(600.0);
        System.out.println(heinzisKonto.getKontostand());

        Jugendgirokonro2 konto = new Jugendgirokonro2("Kerstin",200,300);
        konto.einzahlen(200);
        System.out.println(konto.kontostand);
        konto.auszahlen(400);
        System.out.println(konto.kontostand);
    }
}
