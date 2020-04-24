package Orchester_Vererbung;

import java.util.ArrayList;

public class OrchesterApp {
    public static void main(String[] args) {
        ArrayList<Instrumente> orchesterGraz = new ArrayList<Instrumente>();

        orchesterGraz.add(new Klarinette(5));
        orchesterGraz.add(new Gitarre(1));
        orchesterGraz.add(new Klarinette(8));
        orchesterGraz.add(new Becken(23));

        Orchester grazerOper = new Orchester(orchesterGraz);

        grazerOper.playAll(orchesterGraz);

    }
}
