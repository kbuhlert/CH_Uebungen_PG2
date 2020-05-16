package Getraenke;

public abstract class Getraenk implements Brennbar {
    protected String name;

    public Getraenk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getAnzahlZutaten();
    public abstract boolean beinhaltetAlkohol();
    public abstract double mengeInMl ();


    @Override
    public String toString() {
        return "Getraenk{" +
                "Name: " + name + " /Zutatenzahl: " + getAnzahlZutaten() + " /Alkohol: " + beinhaltetAlkohol() + " /Brennbar: " + brennt() + '}';
    }
}
