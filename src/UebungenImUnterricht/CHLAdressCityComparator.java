package UebungenImUnterricht;

import java.util.Comparator;

public class CHLAdressCityComparator implements Comparator<CHLAddress> {
    @Override
    public int compare(CHLAddress o1, CHLAddress o2){
        return o1.getCity().compareTo(o2.getCity());
    }
}
