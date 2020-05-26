package Comparatoren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Sortieren_comparable {
    public static void main(String[] args) {

        List<Person> personenListe= new ArrayList<>();
        personenListe.add(new Person(4321,"Mustermann"));
        personenListe.add(new Person(3456,"Musterfrau"));
        personenListe.add(new Person(6547,"Huber"));

        Collections.sort(personenListe);

        for(Person p:personenListe){
            System.out.println(p);
        }

    }
}
