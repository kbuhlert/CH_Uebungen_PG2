package Getraenke2;

import java.util.Comparator;

public class AnzahlZutatenComparator2 implements Comparator<Getraenk2> {

    @Override
    public int compare(Getraenk2 o1, Getraenk2 o2) {
        return Integer.compare(o1.getAnzahlZutaten(),o2.getAnzahlZutaten());
    }
}
