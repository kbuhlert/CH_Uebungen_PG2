package Getraenke;

import java.util.ArrayList;

public class GetraenkeApp {

    public static void main(String[] args) {
        Registrierkasse bar9 = new Registrierkasse();

        ArrayList<Fluessigkeit> caipi = new ArrayList<>();
        caipi.add(new Fluessigkeit("Cachaca",60,38));
        caipi.add(new Fluessigkeit("Limettensaft",80,0));
        caipi.add(new Fluessigkeit("Crushed Ice",200,0));

        ArrayList<Fluessigkeit> margarita = new ArrayList<>();
        margarita.add(new Fluessigkeit("Tequila",30,48));
        margarita.add(new Fluessigkeit("Orangenlikör",10,27));
        margarita.add(new Fluessigkeit("Crushed Ice",200,0));
        margarita.add(new Fluessigkeit("Limettensaft",20,0));



        bar9.verkauft(new SimplesGetraenk("Weisswein",new Fluessigkeit("Wein",250,8)));
        bar9.verkauft(new LongDrink("Gin Tonic",new Fluessigkeit("Gin",40,38), new Fluessigkeit("Tonic Water",150,0)));
        bar9.verkauft(new SimplesGetraenk("Cola",new Fluessigkeit("Cola",500,0)));
        bar9.verkauft(new Cocktail("Caipi",caipi));
        bar9.verkauft(new SimplesGetraenk("Wasser",new Fluessigkeit("Wasser",250,0)));
        bar9.verkauft(new SimplesGetraenk("Tee",new Fluessigkeit("Tee",170,0)));
        bar9.verkauft(new SimplesGetraenk("Shot",new Fluessigkeit("Zirbenschnaps",25,43)));
        bar9.verkauft(new Cocktail("Margarita",margarita));
        bar9.verkauft(new LongDrink("Cuba Libre",new Fluessigkeit("Rum",50,48), new Fluessigkeit("Cola",150,0)));

        System.out.println(bar9);
        bar9.printGetraenkeSortiertnachZutaten();
        bar9.printGetraenkSortiertNachMl();
        System.out.println("----");
        System.out.println(bar9.getGetraenkeAufgeteiltNachZutaten());


    }


}
