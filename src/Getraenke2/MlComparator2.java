package Getraenke2;

import java.util.Comparator;

public class MlComparator2 implements Comparator<Getraenk2> {

    @Override
    public int compare(Getraenk2 o1, Getraenk2 o2) {
        return Double.compare(o1.mengeInMl(),o2.mengeInMl());
    }
}
