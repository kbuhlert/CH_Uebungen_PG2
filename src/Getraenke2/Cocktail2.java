package Getraenke2;

import Getraenke.Fluessigkeit;

import java.util.ArrayList;

public class Cocktail2 extends Getraenk2{

    protected ArrayList<Fluessigkeit2> bestandteile;

    public Cocktail2(String name, ArrayList<Fluessigkeit2> bestandteile) {
        super(name);
        this.bestandteile = bestandteile;
    }

    @Override
    int getAnzahlZutaten() {
        return bestandteile.size();
    }

    @Override
    boolean beinhaltetAlkohol() {
        for(Fluessigkeit2 f:bestandteile){
            if(f.getAlkoholProzent()>0){
                return true;
            }
        }
        return false;
    }

    @Override
    double mengeInMl() {
        double gesamtmenge = 0;
        for(Fluessigkeit2 f:bestandteile){
            gesamtmenge += f.getMenge();
        }
        return gesamtmenge;
    }

    @Override
    public boolean brennt() {

        for(Fluessigkeit2 f:bestandteile){
            if(f.getAlkoholProzent()>30){
                return true;
            }
        }
        return false;
    }
}
