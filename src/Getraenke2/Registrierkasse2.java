package Getraenke2;

import Getraenke.Getraenk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Registrierkasse2 {
    private ArrayList<Getraenk2> kasse;
    private static int verkaufteGetraenke = 0;

    public Registrierkasse2() {
        kasse = new ArrayList<Getraenk2>();
    }

    public static int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }

    public void verkauft(Getraenk2 g){
        kasse.add(g);
        verkaufteGetraenke++;
    }

    public void printGetraenkeSortiertNachAnzahlZutaten(){
        Collections.sort(kasse, new AnzahlZutatenComparator2());
        System.out.println("Verkaufte Getraenke nach Zutatenzahl:");
        for (Getraenk2 g : kasse){
            System.out.println(g);
        }
    }
    public void printGetraenkeSortiertNachMl(){
        Collections.sort(kasse,new MlComparator2());
        System.out.println("Verkaufte Getraenke nach Volumen:");
        for (Getraenk2 g : kasse){
            System.out.println(g);
        }
    }

    public HashMap<Integer,ArrayList<Getraenk2>> getGetraenkAufgeteiltNachZutat(){
        HashMap<Integer,ArrayList<Getraenk2>> sortierteGetraenke = new HashMap<>();
        int zutatenzahl = 0;
        ArrayList<Getraenk2> neueListe;
        for(Getraenk2 g : kasse){
            if(sortierteGetraenke.containsKey(g.getAnzahlZutaten())){
                neueListe = sortierteGetraenke.get(g.getAnzahlZutaten());
                neueListe.add(g);
                sortierteGetraenke.put(g.getAnzahlZutaten(),neueListe);
            }
            else
                neueListe = new ArrayList<>();
                neueListe.add(g);
                sortierteGetraenke.put(g.getAnzahlZutaten(),neueListe);
        }
        return sortierteGetraenke;
    }

}
