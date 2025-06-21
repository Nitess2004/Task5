
abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }
    abstract void resize(double factor);
    abstract void rotate(double angle);
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void resize(double factor) {
        radius *= factor;
        System.out.println(name + " resized. New radius: " + radius);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees (rotation has no visual effect on a circle).");
    }
}

class Square extends Shape {
    double side;

    Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    void resize(double factor) {
        side *= factor;
        System.out.println(name + " resized. New side length: " + side);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees.");
    }
}
class Triangle extends Shape {
    double base;
    double height;

    Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    void resize(double factor) {
        base *= factor;
        height *= factor;
        System.out.println(name + " resized. New base: " + base + ", New height: " + height);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees.");
    }
}

// Main class
public class ShapeManipulator {
    public static void main(String[] args) {
        // Create shape objects using polymorphism
        Shape shape1 = new Circle("Circle A", 5);
        Shape shape2 = new Square("Square B", 4);
        Shape shape3 = new Triangle("Triangle C", 3, 6);

        System.out.println("\n--- Shape Manipulations ---");

        manipulateShape(shape1, 2.0, 90);
        manipulateShape(shape2, 1.5, 45);
        manipulateShape(shape3, 0.5, 30);
    }
    public static void manipulateShape(Shape shape, double resizeFactor, double rotateAngle) {
        System.out.println("\nManipulating: " + shape.name);
        shape.resize(resizeFactor);
        shape.rotate(rotateAngle);
    }
}