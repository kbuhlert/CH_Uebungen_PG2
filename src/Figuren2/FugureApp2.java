package Figuren2;

public class FugureApp2 {
    public static void main(String[] args) {

        FigureManager fm = new FigureManager();

        fm.add(new Circle(3.4));
        fm.add(new Rectangle2(5.6,6.8));
        fm.add(new Circle(32.4));
        fm.add(new Rectangle2(54.6,62.8));
        fm.add(new Circle(8.4));
        fm.add(new Rectangle2(25.6,6.8));


        System.out.println(fm.getAverageSize());
        System.out.println(fm.getMaxPerimeter());
        System.out.println(fm.getAreaBySize());
    }

}
