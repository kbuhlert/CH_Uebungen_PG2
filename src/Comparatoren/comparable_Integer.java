package Comparatoren;

public class comparable_Integer implements Comparable<comparable_Integer> {

    //steht in der Klasse und vergleicht sich (das Objekt) mit einem anderen Objekt

    protected String name;
    protected int gewicht;

    public  int getFullWeight(){return 0;};

    @Override
    public int compareTo(comparable_Integer o) {
        return Integer.compare(getFullWeight(), o.getFullWeight());
    }
}
