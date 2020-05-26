package Getraenke2;

public abstract class Getraenk2 implements Brennbar2 {
    protected String name;

    public Getraenk2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Getraenk{" +
                " /Zutatenzahl: " + getAnzahlZutaten() + " Menge: " + mengeInMl()  + " /Alkohol: " + beinhaltetAlkohol() + " /Brennbar: " + brennt() +
                '}';
    }


    abstract int getAnzahlZutaten();
    abstract boolean beinhaltetAlkohol ();
    abstract double mengeInMl();


}
