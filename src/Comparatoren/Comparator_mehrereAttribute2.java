package Comparatoren;

import Kindergarten_Sortieren.Kind;

import java.util.Comparator;

public class Comparator_mehrereAttribute2 implements Comparator<ShopArtikel> {
    @Override
    public int compare(ShopArtikel o1, ShopArtikel o2){
        //erst wird der erste String verglichen, wenn der nicht gleich ist
        // (-->compareTo returniert nicht 0), dann wird dieser vergleich ausgegeben, ansonsten kommt der
        //Vergleich von Attribut2 zum tragen und dieser wird ausgegeben
        if(o1.getNameA().compareTo(o2.getNameA()) != 0)
            return o1.getNameA().compareTo(o2.getNameA());
        else return o1.getNameB().compareTo(o2.getNameB());
    }
}
