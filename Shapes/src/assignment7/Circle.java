package assignment7;

public class Circle extends Shapes {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double surrounding() {
        return 2 * 3.14 * radius;
    }

    public String toString(){
        return String.format("Circle" + "\t\t"  + radius + "\t\t" + area() + "\t\t" + surrounding());
    }
}
