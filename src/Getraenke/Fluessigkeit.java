package Getraenke;

public class Fluessigkeit {
    private String name;
    private double menge;
    private double alkoholProzent;

    public Fluessigkeit(String name, double menge, double alkoholProzent) {
        this.name = name;
        this.menge = menge;
        this.alkoholProzent = alkoholProzent;
    }

    public String getName() {
        return name;
    }

    public double getMenge() {
        return menge;
    }

    public double getAlkoholProzent() {
        return alkoholProzent;
    }
}
