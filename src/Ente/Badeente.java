package Ente;

public class Badeente extends Ente{
    private int gewichtWasser;

    public Badeente(String name, int gewicht, int gewichtWasser) {
        super(name, gewicht);
        this.gewichtWasser = gewichtWasser;
    }

    @Override
    public int getFullWeight (){
        return this.gewichtWasser + super.gewicht;
    }

    @Override
    public String makeNoise(){
        return "Quak BlubBlub Quak";
    }

    @Override
    public String toString() {
        return name + " " + getFullWeight();
    }
}
