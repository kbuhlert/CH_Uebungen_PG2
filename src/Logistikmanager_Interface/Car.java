package Logistikmanager_Interface;

public class Car implements Moveable{
    public String type;
    public Color color;
    public double weight;


    public Car(String type, Color color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(color + " " + type + " will be moved to " + destination);
    }

}
