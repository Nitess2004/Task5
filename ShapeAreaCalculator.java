abstract class Shape {
    
    abstract double calculateArea();
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}
// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        return length * width;
    }
}

// Triangle class
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class 
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);
        System.out.print("Circle ");
        circle.displayArea();

        System.out.print("Rectangle ");
        rectangle.displayArea();

        System.out.print("Triangle ");
        triangle.displayArea();
    }
}