package Tiere_Vererbung;

import java.util.ArrayList;

public class Natur {
    ArrayList<Animal> tierverwaltung = new ArrayList<>();



    public void addAnimal (Animal a){
        tierverwaltung.add(a);
    }

    public int countColor(String color){
        int count = 0;
        for(Animal a : tierverwaltung){
            if(color.equals(a.getColor()))
            count++;
        }
        return count;
    }

}
