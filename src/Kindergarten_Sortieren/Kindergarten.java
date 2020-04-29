package Kindergarten_Sortieren;

import java.util.ArrayList;
import java.util.Collections;

public class Kindergarten{
    private String klasse;
    private ArrayList<Kind> kinderliste ;

    public Kindergarten(String klasse) {
        this.klasse = klasse;
        kinderliste = new ArrayList<>();
    }

    public void addKind (Kind k){
        kinderliste.add(k);
    }

    public String getKlasse() {
        return klasse;
    }

    public ArrayList<Kind> getKinderliste() {
        return kinderliste;
    }

    public void sortAlphabetical(){
        Collections.sort(kinderliste, new AlphabeticalComparator());
        for (Kind k :kinderliste){
            System.out.println(k);
        }
    }

    public void sortAge (){
        Collections.sort(kinderliste,new AgeComperator());
        for (Kind k :kinderliste){
            System.out.println(k);
        }
    }

    /*@Override
    public String toString() {
        return "Kindergarten{" +
                "klasse='" + klasse + '\'' +
                ", kinderliste=" + kinderliste +
                '}';
    }*/
}
