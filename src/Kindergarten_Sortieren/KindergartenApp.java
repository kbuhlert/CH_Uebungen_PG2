package Kindergarten_Sortieren;

import java.util.ArrayList;
import java.util.Collections;

public class KindergartenApp {
    public static void main(String[] args) {

        Kindergarten stAugustin = new Kindergarten("Bären");

        stAugustin.addKind(new Kind("Hubert","Maier",5));
        stAugustin.addKind(new Kind("Jan","Jandl",3));
        stAugustin.addKind(new Kind("Ava","Alberts",6));
        stAugustin.addKind(new Kind("Berta","Zens",4));
        stAugustin.addKind(new Kind("Bilbo","Zens",5));
        stAugustin.addKind(new Kind("Albert","Zens",1));
        stAugustin.addKind(new Kind("Albert","Alberts",5));

        for (Kind k :stAugustin.getKinderliste()){
            System.out.println(k);}

        System.out.println("-----");

        stAugustin.sortAlphabetical();

        System.out.println("-----");

        stAugustin.sortAge();


    }
}
