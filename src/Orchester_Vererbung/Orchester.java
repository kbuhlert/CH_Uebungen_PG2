package Orchester_Vererbung;

import java.util.ArrayList;

public class Orchester {
        //Orchester enthält Arrayliste mit meherern Instrumenten
    protected ArrayList<Instrumente> orchester = new ArrayList <Instrumente>();

    //Konstruktor vom Orchester muss Arrayliste mit übergeben Instrumenten bekommen:
    public Orchester(ArrayList<Instrumente> orchester) {
        this.orchester = orchester;
    }

    //Orchester hat Add-Methode um der Orchesterliste in der Main-Methode Instrumente zuzufügen
    public void addInstrument (Instrumente instrument){
        orchester.add(instrument);
    }

    //mit i.play() wird die play()-Methode für jedes einzelne Instrument aufgerufen, die Wiederum gibt die
    //Lautstärke des Instruments zurück und addiert den Wert zur Gesamtlautstärke und lässt (per sout) die
    // Eigenschaften jedes Instruments aus der Liste ausgeben
    public void playAll (ArrayList<Instrumente> orchester){
        int gesamtlautstärke = 0;
        for (Instrumente i:orchester){
            gesamtlautstärke =+ i.play();
        }
        System.out.println("Gesamtlautstärke: " + gesamtlautstärke);
    }
}
