package Ente2;

import Ente.Ente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entenhausen2 {
    private ArrayList<Ente2> entenverwaltung;

    public Entenhausen2() {
        entenverwaltung=new ArrayList<Ente2>();
    }
    public void addEnte (Ente2 e){
        entenverwaltung.add(e);
    }

    public Map<Integer, List<Ente2>> getGruppierteEnten(){
        Map<Integer, List<Ente2>> nachGewicht = new HashMap<Integer, List<Ente2>>();
        List<Ente2> e100 = new ArrayList<Ente2>();
        List<Ente2> e200 = new ArrayList<Ente2>();
        List<Ente2> e300 = new ArrayList<Ente2>();
        for (Ente2 e:entenverwaltung){
            if (e.getFullWeight()<=100){
                e100.add(e);
            }
            else if (e.getFullWeight()>100 && e.getFullWeight()<=200){
                e200.add(e);
            }
            else
                e300.add(e);
        }
        nachGewicht.put(100,e100);
        nachGewicht.put(200,e200);
        nachGewicht.put(300,e300);
        return nachGewicht;
    }
}
