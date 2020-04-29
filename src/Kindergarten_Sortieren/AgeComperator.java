package Kindergarten_Sortieren;

import java.util.Comparator;

public class AgeComperator implements Comparator<Kind> {
    @Override
    public int compare (Kind o1, Kind o2){
        if(o1.getAlter() < o2.getAlter())   //Sortieren nach Alter
            return -1;
        if (o1.getAlter() > o2.getAlter())  //Sortieren nach Alter
            return 1;
        if (o1.getAlter() == o2.getAlter())     //Wenn Alter der zu vergleichenden Objekte gleich ist
            return o1.getZname().compareTo(o2.getZname());  //dann Vergleiche Nachnamen und Sortiere alphabetisch (mit fertiger compareTo Methode)
        return 0;
    }
}
