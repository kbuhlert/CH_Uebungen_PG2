package Comparatoren;

import java.util.Arrays;

public class Array_Sortieren {

    //Daten die im Array liegen können dort direkt mit einer Methode sort() der Hilfsklasse "Arrays" sortiert werden
    // die sort-Methode gibt es für jeden Datentyp und Strings, diese werden nach natürlicher Ordnung  sortiert
    //die Daten bleiben im Array, es gibt keinen Rückgabewert

    //Arrays.sort(datentyp[]);

    //auch eigene Referenztypen (Objekte) können sortiert werden, bei denen muss allerdings in der Klasse
    //die Sortierung implementiert werden (comparable)

    //bsp. Array von Person[]
    public static void main(String[] args) {
        Person[] personenArray = {new Person(12345,"Mustermann"), new Person(25654,"Huber"),new Person(56778, "Sorglos")};
        //Array sortieren:
        Arrays.sort(personenArray);
        //Ausgabe
        for(Person p:personenArray){
            System.out.println(p);
        }

    }

}
