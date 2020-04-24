package Orchester_Vererbung;

public class Klarinette extends Instrumente {

    /*Die Klarinette erbt die Eigenschaften vom Instrument (Lautstärke) und hat eine eigene Playmethode

     */


    public Klarinette(int lautstärke) {
        super(lautstärke);
    }


    @Override
        public int play() {
            System.out.println("Klarinette wird geblasen mit Lautstärke " + lautstärke);
            return lautstärke;
        }
    }

