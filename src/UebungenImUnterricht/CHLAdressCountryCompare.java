package UebungenImUnterricht;

import java.util.Comparator;

public class CHLAdressCountryCompare implements Comparator<CHLAddress> {
        @Override
        public int compare(CHLAddress o1, CHLAddress o2){
        return o1.getCountry().compareTo(o2.getCountry());
    }

}
