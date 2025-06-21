// Calculator class with overloaded methods
public class Calculator {

    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call each version of add
        int sum1 = calc.add(10, 20);                 // two integers
        double sum2 = calc.add(3.5, 4.2);            // two doubles
        int sum3 = calc.add(5, 10, 15);              // three integers

        // Print results
        System.out.println("Sum of 10 and 20 (int): " + sum1);
        System.out.println("Sum of 3.5 and 4.2 (double): " + sum2);
        System.out.println("Sum of 5, 10, and 15 (int): " + sum3);
    }
}