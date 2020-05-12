package Ente;

import java.util.Comparator;

public abstract class Ente implements Comparable<Ente> {

    protected String name;
    protected int gewicht;

    public Ente(String name, int gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public abstract int getFullWeight ();
    public abstract String makeNoise();

    @Override
    public int compareTo(Ente e){
        //noch klären warum das so nicht funktioniert (mit CHL Hase vergleichen)
       // return gewicht.compareTo(e.gewicht);
        return Integer.compare(getFullWeight(), e.getFullWeight()); //Verstehe ich noch nicht?
    }
}
