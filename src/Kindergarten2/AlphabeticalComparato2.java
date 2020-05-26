package Kindergarten2;

import java.util.Comparator;

public class AlphabeticalComparato2 implements Comparator <Kind2> {

    @Override
    public int compare(Kind2 o1, Kind2 o2) {

        String a = o1.getZname() + "" + o1.getVname();
        String b = o2.getZname() + "" + o2.getZname();

        return a.compareTo(b);
    }


}
