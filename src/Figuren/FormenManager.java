package Figuren;

import java.util.ArrayList;
import java.util.HashMap;

public class FormenManager {
    ArrayList<Formen> formVerwalter;

    public FormenManager() {
        formVerwalter = new ArrayList<Formen>();
    }

    public void addFormen (Formen form){
        formVerwalter.add(form);
    }

    public double getMaxUmfang(){
        double maxUmfang = 0;
        for(Formen f:formVerwalter){
            if(f.getUmfang()>maxUmfang){
                maxUmfang = f.getUmfang();
            }
        }
        return maxUmfang;
    }

    public double getDurchschittFlaeche(){
        double alleFlaechen = 0;
        int count = 0;
        for(Formen f:formVerwalter){
            alleFlaechen += f.getFlaeche();
            count++;
        }
        return alleFlaechen/count;
    }

    public HashMap<String,Double> getFlaecheNachKategorie2(){   //verbesserste Methode mit Hilfsvariable zum Aufsummieren
        double summeKlein=0;
        double summeMittel=0;
        double summeGross=0;
        for(Formen f:formVerwalter){
            if(f.getFlaeche()<1000){
                summeKlein += f.getFlaeche();
            }
            if(f.getFlaeche()>=1000 && f.getFlaeche()<5000){
                summeMittel += f.getFlaeche();
            }
            else {
                summeGross += f.getFlaeche();
            }
        }
        HashMap<String,Double> flaecheNachKategorie = new HashMap<>();
        flaecheNachKategorie.put("Klein", summeKlein);
        flaecheNachKategorie.put("Mittel", summeMittel);
        flaecheNachKategorie.put("Groß", summeGross);
        return flaecheNachKategorie;
    }

    public HashMap<String,Double> getFlaechenachKategorie() {   //Kategorie = Klein (<1000), Mittel(1000-4999), Groß(>=5000)
        HashMap<String, Double> flaecheMitKategorie = new HashMap<>();
        for (Formen f : formVerwalter) {        //alle Formen in der ArrayList durchgehen
            if (f.getFlaeche() < 1000) {        //wenn Fläche der Form kleiner 1000 (Kategorie "Klein"
                if (flaecheMitKategorie.containsKey("Klein")) { //falls HashMap bereits key "klein" enthält:
                    double summeklein;
                    summeklein = f.getFlaeche() + flaecheMitKategorie.get("Klein");// wird die Fläche der aktuellen Form aus Liste zum Wert der Kategorie zugezählt
                    flaecheMitKategorie.put("Klein", summeklein);   //dann wird summierte Fläche als neuer Wert der Kategorie "Klein" in HashMap gelegt
                } else {                                               //falls es in HashMap noch nicht den Key "Klein" gibt
                    flaecheMitKategorie.put("Klein", f.getFlaeche());   //kann Flächen-Wert der aktuellen Form direkt eingefügt werden
                }
            } else if (f.getFlaeche() >= 1000 && f.getFlaeche() < 5000) { //wie oben, schauen ob Form zur Kategorie "Mittel" gehört
                if (flaecheMitKategorie.containsKey("Mittel")) {    //dann prüfen, ob es für die Kategorie bereits einen Wert in HashMap gibt
                    double summemittel;
                    summemittel = f.getFlaeche() + flaecheMitKategorie.get("Mittel");   //wenn Wert vorhanden, dann aktuellen Flächenwert dazu summieren
                    flaecheMitKategorie.put("Mittel", summemittel); //und in HashMap als neuen Wert (Summe) ablegen
                } else {
                    flaecheMitKategorie.put("Mittel", f.getFlaeche());  //wenn es noch keinen Key "Mittel" gibt müssen keine Flächen summiert werden
                }                                                       //Flächenwert kann also direkt in HashMap gelegt werden
            } else {
                if (flaecheMitKategorie.containsKey("Groß")) {
                    double summegross;
                    summegross = f.getFlaeche() + flaecheMitKategorie.get("Groß");
                    flaecheMitKategorie.put("Groß", summegross);
                } else {
                    flaecheMitKategorie.put("Groß", f.getFlaeche());
                }
            }
        }
        return flaecheMitKategorie;
    }

}
