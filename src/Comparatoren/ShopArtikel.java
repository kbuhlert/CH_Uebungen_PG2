package Comparatoren;

public class ShopArtikel {
    private String nameA;
    private String nameB;
    private double preis;

    public ShopArtikel(String bezeichnung, double preis) {
        this.nameA = bezeichnung;
        this.preis = preis;
    }

    public String getNameA() {
        return nameA;
    }

    public double getPreis() {
        return preis;
    }

    public String getNameB() {
        return nameB;
    }

    @Override
    public String toString() {
        return "ShopArtikel{" +
                "nameA='" + nameA + '\'' +
                ", preis=" + preis +
                '}';
    }
}
