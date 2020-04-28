package Figuren;
import java.lang.Math;      //importiert Klasse Math mit der Mathematische operationen gemacht werden können

public class Kreis extends Formen{
    protected double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public double getUmfang() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getFlaeche() {
        return Math.pow(radius,2)*Math.PI;  //Math.pow = Zahl, Hochzahl und Math.Pi = Pi (3.141...)
    }
}
