package UebungVererbung2;


import java.util.ArrayList;

public class Kunde extends Person{
    private int kundennr;
    private ArrayList<Adresse> adressListe;


    public Kunde(int kundennr, String firstname, String lastName) {
        this.kundennr = kundennr;
        this.adressListe = new ArrayList<Adresse>();
        super.firsName = firstname;
        super.lastName = lastName;
    }
    
    public void addAdresse (Adresse a){
        adressListe.add(a);
    }


    @Override
    public String toString() {
        return "Kunde{" +
                "kundennr=" + kundennr +
                ", adressListe=" + adressListe +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
