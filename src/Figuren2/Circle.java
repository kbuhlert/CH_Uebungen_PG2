package Figuren2;

public class Circle extends Figure{

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }
}
