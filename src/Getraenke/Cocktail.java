package Getraenke;

import java.util.ArrayList;

public class Cocktail extends Getraenk{
    protected ArrayList<Fluessigkeit> bestandteile;

    public Cocktail(String name, ArrayList<Fluessigkeit> bestandteile) {
        super(name);
        this.bestandteile = bestandteile;
    }

    @Override
    public int getAnzahlZutaten() {
        return bestandteile.size();
    }

    @Override
    public boolean beinhaltetAlkohol() {
        for (Fluessigkeit f:bestandteile){
            if(f.getAlkoholProzent()>0){
                return true;
            }
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        double gesamtmenge = 0;
        for (Fluessigkeit f:bestandteile){
            gesamtmenge+= f.getMenge();
        }
        return gesamtmenge;
    }


    @Override
    public boolean brennt() {
        for (Fluessigkeit f:bestandteile) {
            if (f.getAlkoholProzent() > 30) {
                return true;
            }
        }
        return false;
    }
}
