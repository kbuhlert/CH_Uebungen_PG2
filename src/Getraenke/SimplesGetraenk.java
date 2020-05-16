package Getraenke;

public class SimplesGetraenk extends Getraenk{
    protected Fluessigkeit bestandteil;

    public SimplesGetraenk(String name, Fluessigkeit bestandteil) {
        super(name);
        this.bestandteil = bestandteil;
    }

    @Override
    public int getAnzahlZutaten() {
        return 1;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if(bestandteil.getAlkoholProzent()>0){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
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
