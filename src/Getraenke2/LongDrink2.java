package Getraenke2;

import Getraenke.Fluessigkeit;

public class LongDrink2 extends Getraenk2 {

    protected Fluessigkeit2 spirituose;
    protected Fluessigkeit2 filler;

    public LongDrink2(String name, Fluessigkeit2 spirituose, Fluessigkeit2 filler) {
        super(name);
        this.spirituose = spirituose;
        this.filler = filler;
    }

    @Override
    int getAnzahlZutaten() {
        return 2;
    }

    @Override
    boolean beinhaltetAlkohol() {
        if(spirituose.getAlkoholProzent()>0 ||filler.getAlkoholProzent()>0){
            return true;
        }
        return false;
    }

    @Override
    double mengeInMl() {
        return spirituose.getMenge()+filler.getMenge();
    }

    @Override
    public boolean brennt() {
        if(spirituose.getAlkoholProzent()>30 ||filler.getAlkoholProzent()>30){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "LongDrink2{" +
                "spirituose=" + spirituose.getName() +
                ", filler=" + filler.getName() +
                ", name='" + name + '\'' +
                '}';
    }
}
