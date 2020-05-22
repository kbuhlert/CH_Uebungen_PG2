package Comparatoren;

import java.util.Comparator;

public class Comparator_mehrereAtrribute1 implements Comparator<ShopArtikel> {
    @Override
    public int compare(ShopArtikel o1, ShopArtikel o2) {
        // wenn wir nach mehreren attributen sortieren wollen, dann muss zuerst nach attribut 1 sortiert werden
        // und das ergebnis in einer hilfsvariable gespeichert werden:
        int h = o1.getNameA().compareTo(o2.getNameA());
        if (h!= 0) return h;
        // --> wenn h ungleich 0 ist, bedeutet das ja bereits,dass die beiden bezeichnungen von o1 und o2
        // unterschiedlich sind dann wird h schon retourniert.
        // wenn h == 0 ist, dann sind die o1 und o2 gleich und es muss das 2. Attribut verglichen werden, z.B. der Preis jetzt muss der zweite vergleich mittels if abfrage erfolgen
        if (o1.getPreis() < o2.getPreis()) return -1;
        if (o1.getPreis() > o2.getPreis()) return 1;
        return 0;
    }
    }
