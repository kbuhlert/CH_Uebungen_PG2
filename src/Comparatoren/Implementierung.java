package Comparatoren;

import java.util.Collections;
import java.util.List;

public class Implementierung {

    private List<ShopArtikel> shoppinglist;

    public void sortAge()
    {
        Collections.sort(shoppinglist, new Comparator_If1());

    }
}
