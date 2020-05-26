package Getriebe;

public class GangExistiertNichtException extends Exception{
    //Konstruktor
    public GangExistiertNichtException() {
    }
    //Ausgabe des Fehlertextes aus der Methode
    public GangExistiertNichtException(String message) {
        super(message);
    }
}
