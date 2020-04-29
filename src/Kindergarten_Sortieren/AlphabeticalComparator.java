package Kindergarten_Sortieren;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Kind> {
    @Override
    public int compare(Kind o1, Kind o2){
        if(o1.getZname().compareTo(o2.getZname()) != 0)
        return o1.getZname().compareTo(o2.getZname());
        else return o1.getVname().compareTo(o2.getVname());
    }

}
