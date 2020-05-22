package Comparatoren;

import java.util.Comparator;

public class Comparator_mehrereAttributeString implements Comparator<ShopArtikel> {

        @Override
        public int compare(ShopArtikel o1, ShopArtikel o2) {
            //es wird einfach ein neuer String gemacht, der sich aus Attribut 1 und 2 zusammensetzt
            String o1Name = o1.getNameA() + " " + o1.getNameB();
            String o2Name = o2.getNameA() + " " + o2.getNameB();
            //der zusammengesetzte String wird dann verglichen
            return o1Name.compareTo(o2Name);
        }
}
