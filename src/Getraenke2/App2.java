package Getraenke2;

import Getraenke.Cocktail;
import Getraenke.Fluessigkeit;
import Getraenke.LongDrink;
import Getraenke.SimplesGetraenk;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {

        Registrierkasse2 bar9 = new Registrierkasse2();

        ArrayList<Fluessigkeit2> caipi = new ArrayList<>();
        caipi.add(new Fluessigkeit2("Cachaca",60,38));
        caipi.add(new Fluessigkeit2("Limettensaft",80,0));
        caipi.add(new Fluessigkeit2("Crushed Ice",200,0));

        ArrayList<Fluessigkeit2> margarita = new ArrayList<>();
        margarita.add(new Fluessigkeit2("Tequila",30,48));
        margarita.add(new Fluessigkeit2("Orangenlikör",10,27));
        margarita.add(new Fluessigkeit2("Crushed Ice",200,0));
        margarita.add(new Fluessigkeit2("Limettensaft",20,0));



        bar9.verkauft(new SimpleGetraenk2("Weisswein",new Fluessigkeit2("Wein",250,8)));
        bar9.verkauft(new LongDrink2("Gin Tonic",new Fluessigkeit2("Gin",40,38), new Fluessigkeit2("Tonic Water",150,0)));
        bar9.verkauft(new SimpleGetraenk2("Cola",new Fluessigkeit2("Cola",500,0)));
        bar9.verkauft(new Cocktail2("Caipi",caipi));
        bar9.verkauft(new SimpleGetraenk2("Wasser",new Fluessigkeit2("Wasser",250,0)));
        bar9.verkauft(new SimpleGetraenk2("Tee",new Fluessigkeit2("Tee",170,0)));
        bar9.verkauft(new SimpleGetraenk2("Shot",new Fluessigkeit2("Zirbenschnaps",25,43)));
        bar9.verkauft(new Cocktail2("Margarita",margarita));
        bar9.verkauft(new LongDrink2("Cuba Libre",new Fluessigkeit2("Rum",50,48), new Fluessigkeit2("Cola",150,0)));

        System.out.println(bar9);
        bar9.printGetraenkeSortiertNachAnzahlZutaten();
        bar9.printGetraenkeSortiertNachMl();
        System.out.println("----");
        System.out.println(bar9.getGetraenkAufgeteiltNachZutat());

    }

}
