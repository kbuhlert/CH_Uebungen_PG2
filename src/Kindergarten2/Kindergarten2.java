package Kindergarten2;

import java.util.ArrayList;
import java.util.Collections;

public class Kindergarten2 {

    private String gruppe;
    private ArrayList<Kind2> alleKinder;

    public Kindergarten2(String gruppe) {
        this.gruppe = gruppe;
        alleKinder = new ArrayList<Kind2>();
    }

    public String getGruppe() {
        return gruppe;
    }

    public ArrayList<Kind2> getAlleKinder() {
        return alleKinder;
    }

    public void addKind (Kind2 k){
        alleKinder.add(k);
    }

    public void sortAlphabetical (){
        Collections.sort(alleKinder,new AlphabeticalComparato2());
    }

    public void sortAge (){
        Collections.sort(alleKinder, new AgeComparator2());
    }

}
