package Comparatoren;

public class comparable_Integer_If implements Comparable<comparable_Integer_If> {

    protected String name;
    protected int gewicht;

    public  int getFullWeight(){return 0;};

    @Override
    public int compareTo(comparable_Integer_If o) {
        if(this.gewicht < o.gewicht)
            return-1;
        if(this.gewicht > o.gewicht)
            return 1;
        return 0;
    }
}
