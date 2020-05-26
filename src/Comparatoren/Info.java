package Comparatoren;

public class Info {

    //comparable-Interface:
    // mit dem Interface werden Klassen erweitert um Referenzobjekte in Arrays und
    // Collections sortierbar zu machen. Der Vergleich ist zwischen einem Attribut des
    // aktuellen Objekts (this.attribut) und dem gleichen Attribut eines weiteren Objekts

    //Comparator:
    //sortiert Werte in Collections. Ist eigene Klasse und wird gemeinsam mit den Objekten,
    // die verglichen werden sollen aufgerufen


    /*
    Strings und Wrapperklassen (Integer, Double, Character,...) können über .compare
    (=Methode der Wrapperklasse) verglichen werden -->Natürlich Sortierung

    return Integer.compare(o1.getInt,o2.getInt);

    oder mit .compareTo (wie bei String)

    return ((Integer)o1.getInt()).compareTo(o2.getInt());
    */



}
