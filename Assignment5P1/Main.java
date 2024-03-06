package Assignment5P1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(3,4,5,6);

        System.out.println("Radius of Circle = 5");
        System.out.println("Circle Area = "+circle.area());
        System.out.println("Circle Perimeter = "+circle.perimeter());

        System.out.println("\nLength and Breadth of Rectangle = 4 and 5");
        System.out.println("Rectangle Area = "+rectangle.area());
        System.out.println("Rectangle Perimeter = "+rectangle.perimeter());

        System.out.println("\nBase, Height, Side 1 and Side 2 of Triangle = 3, 4, 5 and 6");
        System.out.println("Triangle Area = "+triangle.area());
        System.out.println("Triangle Perimeter = "+triangle.perimeter());
    }
}
