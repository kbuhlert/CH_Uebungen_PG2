package Ente2;

public class Badeente2 extends Ente2 {

    private int gewichtWasser;

    public Badeente2(String name, int gewicht, int gewichtWasser) {
        super(name, gewicht);
        this.gewichtWasser = gewichtWasser;
    }

    @Override
    public int getFullWeight() {
        return this.gewichtWasser + gewicht;
    }

    @Override
    public String makeNoise() {
        return "Plitsch Platsch. Quak!";
    }

    @Override
    public String toString() {
        return "Badeente2{" +
                "name='" + name + '\'' +
                ", gewicht=" + this.getFullWeight() +
                '}';
    }
}
