package Comparatoren;

import java.util.Comparator;

public class Comparator_compare_WrapperKlasse implements Comparator<ShopArtikel>{

        @Override
        public int compare(ShopArtikel o1, ShopArtikel o2) {

            return Double.compare(o1.getPreis(), o2.getPreis());
        }

}
