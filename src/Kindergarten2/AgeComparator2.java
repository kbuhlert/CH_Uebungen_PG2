package Kindergarten2;


import java.util.Comparator;

public class AgeComparator2 implements Comparator<Kind2> {

    @Override
    public int compare(Kind2 o1, Kind2 o2) {

        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
