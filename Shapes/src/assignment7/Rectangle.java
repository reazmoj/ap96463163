package assignment7;

public class Rectangle extends Shapes {
    private double length;
    private double width;

    public Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double surrounding() {
        return 2 * (length + width);
    }

    public String toString(){
        return String.format("Rectang"  + "\t\t" + length + "\t\t" + width+ "\t\t\t" + area() + "\t\t" + surrounding());
    }
}
