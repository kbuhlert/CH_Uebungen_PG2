package Comparatoren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_Sortieren_Comparator {
    public static void main(String[] args) {
        List<ShopArtikel> artikelListe= new ArrayList<>();
        artikelListe.add(new ShopArtikel("Shirt",15));
        artikelListe.add(new ShopArtikel("Hose",25));
        artikelListe.add(new ShopArtikel("Krawatte",18));

        Collections.sort(artikelListe,new Comparator_compare_WrapperKlasse());

        for(ShopArtikel sa:artikelListe){
            System.out.println(sa);
        }


    }

}
