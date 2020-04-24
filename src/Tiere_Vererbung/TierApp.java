package Tiere_Vererbung;

public class TierApp {
    public static void main(String[] args) {
        Frog quaxi = new Frog("grün", 2);
        quaxi.makeNoise();
        quaxi.walk();

        Katze mietzi = new Katze("schwarz",2);
        mietzi.makeNoise();
        mietzi.walk();

        //Quaxi wird in Animal upgecastet
        Animal quaxiIstAnimal = (Animal)quaxi;
        quaxi.walk();       //Quaxi läuft bei Methodenaufruf nicht wie Animal, sondern wie Frosch
        quaxi.gehSchwimmen(); //Quaxi kann Methode aufrufen, die es nur für Frösche gibt,
                            // obwohl er jetzt als Animal upgecastet wurde ist er auch noch Frosch

        quaxiIstAnimal.walk();//Auch QuaxiIstAnimal verhält sich beim laufen wie Frosch, obwohl er Klasse Animal ist
                                //QuaxiIstAnimal kann aber NICHT die Frog-Methode geSchwimmen() aufrufen

        //Quaxi wird wieder zu Frog downgecastet
        Frog quaxiIstWiederFrog = (Frog)quaxi;
        quaxiIstWiederFrog.walk();
        quaxi.walk();
        quaxi.isswas();
        quaxiIstWiederFrog.isswas();

        //Klasse Natur mit Tierverwaltung ausprobieren und Tiere hinzufügen:

        Natur tierliste = new Natur(); //neue Liste der Klasse Natur

        //Zufügen von den oben kreierten Tieren zur Liste
        tierliste.addAnimal(quaxiIstAnimal);
        tierliste.addAnimal(quaxi);
        tierliste.addAnimal(mietzi);
        tierliste.addAnimal(quaxiIstWiederFrog);

        //Zufügen neuer Tiere zur tierliste
        tierliste.addAnimal(new Animal("gelb",3));
        tierliste.addAnimal(new Animal("gelb",2));

        //Ausgabe wieviel Tiere Gelb und wieviele Tiere Grün sind
        System.out.println(tierliste.countColor("gelb"));
        System.out.println(tierliste.countColor("grün"));

    }

}
