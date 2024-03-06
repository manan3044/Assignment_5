package Assignment5P1;

public class Rectangle implements Shapes{
    double length, breadth;

    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return (length*breadth);
    }

    @Override
    public double perimeter() {
        return (2 * (length+breadth));
    }

}
