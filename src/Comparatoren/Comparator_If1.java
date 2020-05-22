package Comparatoren;

import java.util.Comparator;

public class Comparator_If1 implements Comparator<ShopArtikel> {

    @Override
    public int compare(ShopArtikel o1, ShopArtikel o2) {

        if (o1.getPreis() < o2.getPreis()) {
            return -1;
        }
        if (o1.getPreis() > o2.getPreis()) {
            return 1;
        }
        return 0;
    }
}
