package Getraenke;

import java.util.Comparator;

public class AnzahlZutatenComparator implements Comparator<Getraenk> {

    @Override
    public int compare(Getraenk o1, Getraenk o2) {
        int c = Integer.compare(o1.getAnzahlZutaten(), o2.getAnzahlZutaten());
        return c;
    }

    //Alternative Methode
    /*@Override
    public int compare2(Getraenk o1, Getraenk o2) {
        if(o1.getAnzahlZutaten()<o2.getAnzahlZutaten()){
            return -1;
        }
        if(o1.getAnzahlZutaten()>o2.getAnzahlZutaten()){
            return 1;
        }
        return 0;
    }*/

}
