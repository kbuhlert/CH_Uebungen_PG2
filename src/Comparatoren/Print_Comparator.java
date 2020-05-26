package Comparatoren;

import Getraenke.Getraenk;
import Getraenke.MlComparator;
import Getraenke.Registrierkasse;

import java.util.ArrayList;
import java.util.Collections;

public class Print_Comparator  {

    ArrayList<Getraenk> registrierkasse = new ArrayList<>();

    public void printGetraenkSortiertNachMl(){
        Collections.sort(registrierkasse,new MlComparator());
        System.out.println("Getränke aus Registrierkasse. Sortiert nach Gesamtmenge");
        for(Getraenk g:registrierkasse){
            System.out.println(g);
        }
    }
}
