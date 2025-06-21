public class Geometry {

    // Area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            // You could add other conditional logic here if needed
            return -1; // return -1 to indicate invalid use
        }
    }

    // Main method to test all area methods
    public static void main(String[] args) {
        Geometry geo = new Geometry();

        double circleArea = geo.calculateArea(5.0);                         // Circle
        double rectangleArea = geo.calculateArea(4.0, 6.0);                // Rectangle
        double triangleArea = geo.calculateArea(3.0, 7.0, true);           // Triangle

        // Print results
        System.out.println("Area of Circle (radius 5.0): " + circleArea);
        System.out.println("Area of Rectangle (4.0 x 6.0): " + rectangleArea);
        System.out.println("Area of Triangle (base 3.0, height 7.0): " + triangleArea);
    }
}