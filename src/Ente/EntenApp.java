package Ente;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntenApp {
    public static void main(String[] args) {
        Entenhausen entenverwaltung = new Entenhausen();
        entenverwaltung.addEnte(new Badeente("Qietscheentchen",70,26));
        entenverwaltung.addEnte(new Badeente("Ducky",75,26));
        entenverwaltung.addEnte(new Badeente("FatDuck",220,56));
        entenverwaltung.addEnte(new FlugEnte("Donald",170,16));
        entenverwaltung.addEnte(new FlugEnte("Herbert",175,36));
        entenverwaltung.addEnte(new FlugEnte("A-12",100,56));

        System.out.println(entenverwaltung.getArrayList());
        //Collections.sort(entenverwaltung.getArrayList());     //Wenn hier sortiert wird, werden die Enten unten entsprechend sortiert in die HAshMap gegeben, dann ist unten Sortierung nicht notwendig
        System.out.println(entenverwaltung.getArrayList());

        System.out.println(entenverwaltung.getGruppierteEnten());

        Map<Integer, List<Ente>> entenSteuer = new HashMap<>();
                entenSteuer = entenverwaltung.getGruppierteEnten();

                for(Integer i:entenSteuer.keySet()){
                    System.out.println(i + " " + entenSteuer.get(i));
                }
        for(Integer i:entenSteuer.keySet()){
            Collections.sort(entenSteuer.get(i));   //Sortieren macht nur Sinn, wenn oben nicht bereits die ArrayListe die sämtliche Enten enthält sortiert wurde
            System.out.println(i + " " + entenSteuer.get(i));
        }


    }
}
