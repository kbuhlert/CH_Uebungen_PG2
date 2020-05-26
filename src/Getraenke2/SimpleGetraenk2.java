package Getraenke2;

import Getraenke.Getraenk;

public class SimpleGetraenk2 extends Getraenk2 {

    protected Fluessigkeit2 bestandteil;

    public SimpleGetraenk2(String name, Fluessigkeit2 bestandteil) {
        super(name);
        this.bestandteil = bestandteil;
    }

    @Override
    int getAnzahlZutaten() {
        return 1;
    }

    @Override
    boolean beinhaltetAlkohol() {
        if(bestandteil.getAlkoholProzent()>0){
            return true;
        }
        return false;
    }

    @Override
    double mengeInMl() {
        return bestandteil.getMenge();
    }

    @Override
    public boolean brennt() {
        if(bestandteil.getAlkoholProzent()>30){
            return true;
        }
        return false;
    }
}
