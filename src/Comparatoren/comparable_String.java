package Comparatoren;

public class comparable_String implements Comparable<comparable_String> {
    private String nameA;

    public int compareTo(comparable_String o) {
        return nameA.compareTo(o.nameA);
    }
}
