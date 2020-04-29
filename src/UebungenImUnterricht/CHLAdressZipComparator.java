package UebungenImUnterricht;

import java.util.Comparator;

public class CHLAdressZipComparator implements Comparator<CHLAddress> {
    @Override
    public int compare(CHLAddress o1, CHLAddress o2){
        return o1.getZip().compareTo(o2.getZip());
    }
}
