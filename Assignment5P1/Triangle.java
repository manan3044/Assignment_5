package Assignment5P1;

public class Triangle implements Shapes{
    double base, height, side1, side2;

    public Triangle(double base, double height, double side1, double side2)
    {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area()
    {
        return (0.5 * base * height);
    }

    @Override
    public double perimeter()
    {
        return (base + side1 + side2);
    }
}
