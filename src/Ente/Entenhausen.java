package Ente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entenhausen {
    private ArrayList<Ente> entenverwaltung;

    public Entenhausen() {
        entenverwaltung = new ArrayList<Ente>();
    }

    public void addEnte (Ente e){
        entenverwaltung.add(e);
    }

    public ArrayList<Ente> getArrayList() {
        return entenverwaltung;
    }

    public Map<Integer, List<Ente>> getGruppierteEnten(){
        Map<Integer,List<Ente>> gruppierteEntenNachGewicht = new HashMap<>();
        List<Ente> kleineEntenListe = new ArrayList<Ente>();
        List<Ente> mittlereEntenListe = new ArrayList<Ente>();
        List<Ente> großeEntenListe = new ArrayList<Ente>();
        for(Ente e:entenverwaltung) {
            if (e.getFullWeight() <= 100) {
                kleineEntenListe.add(e);
            }
            if (e.getFullWeight() <= 200 && e.getFullWeight() > 100) {
                mittlereEntenListe.add(e);
            }
            if (e.getFullWeight() <= 300 && e.getFullWeight() > 200) {
                großeEntenListe.add(e);
            }
        }

        gruppierteEntenNachGewicht.put(100,kleineEntenListe);
        gruppierteEntenNachGewicht.put(200,mittlereEntenListe);
        gruppierteEntenNachGewicht.put(300,großeEntenListe);

        return gruppierteEntenNachGewicht;
        }

    @Override
    public String toString() {
        return "entenverwaltung=" + entenverwaltung;
    }
}
