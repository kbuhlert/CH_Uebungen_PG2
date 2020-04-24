package Logistikmanager_Interface;

public class Shirt implements Moveable{
    public String brand;
    public Color color;
    public Size size;

    public Shirt(String brand, Color color, Size size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    @Override
    public void move(String destination) {
        System.out.println(color + " " + brand + " in size " +  size +" will be worn in " + destination);
    }
}
