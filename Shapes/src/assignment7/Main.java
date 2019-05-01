package assignment7;

import java.util.Random;

public class Main {

    public static void main (String[] args) {
        double length = 5 , width = 4;
        Shapes Rectangle = new Rectangle(length , width);
        System.out.println(Rectangle);

        double radius = 3.5;
        Shapes Circle = new Circle(radius);
        System.out.println(Circle);

        double side = 5;
        Shapes Square = new Square(side);
        System.out.println(Square);



    }
}
