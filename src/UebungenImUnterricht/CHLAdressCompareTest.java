package UebungenImUnterricht;

import java.util.ArrayList;
import java.util.Collections;

public class CHLAdressCompareTest {

    public static void main(String[] args) {
        ArrayList<CHLAddress> kundenDatenbank = new ArrayList<CHLAddress>();

        kundenDatenbank.add(new CHLAddress("Jada", "71822", "Backnang", "AT"));
        kundenDatenbank.add(new CHLAddress("Straße", "71522", "Backnang", "DE"));
        kundenDatenbank.add(new CHLAddress("Grün", "6010", "Graz", "Österreich"));

        //Sortiert ArrayList nach Zip-Code
        Collections.sort(kundenDatenbank, new CHLAdressZipComparator());
        for (CHLAddress a: kundenDatenbank){
            System.out.println(a);
        }

        System.out.println("-----");
        //Sortiert ArrayList nach Stadt
        Collections.sort(kundenDatenbank,new CHLAdressCityComparator());
        for (CHLAddress a: kundenDatenbank){
            System.out.println(a);
        }

        System.out.println("-----");
        //Sortiert ArrayList nach Land
        Collections.sort(kundenDatenbank,new CHLAdressCountryCompare());
        for (CHLAddress a: kundenDatenbank){
            System.out.println(a);
        }




    }



}
