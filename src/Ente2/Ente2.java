package Ente2;

import java.util.Objects;

public abstract class Ente2 implements Comparable<Ente2>{
    protected String name;
    protected int gewicht;

    public Ente2(String name, int    gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public abstract int getFullWeight ();
    public abstract String makeNoise ();

    @Override
    public int compareTo(Ente2 o) {
        return Integer.compare(getFullWeight(),o.getFullWeight());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ente2)) return false;
        Ente2 ente2 = (Ente2) o;
        return Objects.equals(name, ente2.name) &&
                Objects.equals(gewicht, ente2.gewicht);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gewicht);
    }
}
