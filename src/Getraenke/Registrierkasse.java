package Getraenke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Registrierkasse {
    private ArrayList<Getraenk> registrierkasse;
    private static int verkaufteGetraenke = 0;

    public Registrierkasse() {
        registrierkasse = new ArrayList<Getraenk>();
    }

    public static int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }

    public void verkauft (Getraenk g){
        registrierkasse.add(g);
        verkaufteGetraenke++;
    }
    public void printGetraenkeSortiertnachZutaten(){
        Collections.sort(registrierkasse, new AnzahlZutatenComparator());
        System.out.println("Getränke aus Registrierkasse. Sortiert nach Zutatenzahl:");
        for(Getraenk g:registrierkasse){
            System.out.println(g);
        }
    }
    public void printGetraenkSortiertNachMl(){
        Collections.sort(registrierkasse,new MlComparator());
        System.out.println("Getränke aus Registrierkasse. Sortiert nach Gesamtmenge");
        for(Getraenk g:registrierkasse){
            System.out.println(g);
        }
    }

    public HashMap<Integer, ArrayList<Getraenk>> getGetraenkeAufgeteiltNachZutaten(){
        HashMap<Integer, ArrayList<Getraenk>> getraenkeNachZutat = new HashMap<>();

        for(Getraenk g:registrierkasse){
            ArrayList<Getraenk> zwischenliste = new ArrayList<>();
            if (getraenkeNachZutat.containsKey(g.getAnzahlZutaten())){
                zwischenliste = getraenkeNachZutat.get(g.getAnzahlZutaten());
                zwischenliste.add(g);
                getraenkeNachZutat.put(g.getAnzahlZutaten(),zwischenliste);
            }else{
                zwischenliste.add(g);
                getraenkeNachZutat.put(g.getAnzahlZutaten(),zwischenliste);
            }
        }
        return getraenkeNachZutat;
    }
}
