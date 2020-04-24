package Orchester_Vererbung;

public abstract class Instrumente {

    /*Instrument ist abstrakte Klasse und erfordert als Blaupause, dass in den Unterklassen
    die Methoden überschrieben werden und es kann kein Objekt Instrument erstellt werden
     */

    public int lautstärke;

    public Instrumente(int lautstärke) {
        this.lautstärke = lautstärke;
    }

    public int getLautstärke() {
        return lautstärke;
    }

    public abstract int play();
}
