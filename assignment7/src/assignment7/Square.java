package assignment7;

public class Square extends Shapes {
    private double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double surrounding() {
        return 4 * side;
    }

    public String toString(){
        return String.format("Square" + "\t\t" + side + "\t\t" + area() + "\t\t" + surrounding());
    }
}
