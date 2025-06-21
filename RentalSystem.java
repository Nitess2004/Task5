
abstract class Vehicle {
    abstract double calculateRentalCost(int hours);
}

// Car class
class Car extends Vehicle {
    double ratePerHour = 15.0;
    double calculateRentalCost(int hours) {
        return ratePerHour * hours;
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {
    double ratePerHour = 10.0; 
    double calculateRentalCost(int hours) {
        return ratePerHour * hours;
    }
}
class Bicycle extends Vehicle {
    double ratePerHour = 5.0; // $5 per hour

    @Override
    double calculateRentalCost(int hours) {
        return ratePerHour * hours;
    }
}

// Main class to test the program
public class RentalSystem {
    public static void main(String[] args) {
        // Create vehicle objects using polymorphism
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();

        // Rental hours
        int hours = 3;

        // Calculate and print rental costs
        System.out.println("Car rental for " + hours + " hours: $" + car.calculateRentalCost(hours));
        System.out.println("Motorcycle rental for " + hours + " hours: $" + motorcycle.calculateRentalCost(hours));
        System.out.println("Bicycle rental for " + hours + " hours: $" + bicycle.calculateRentalCost(hours));
    }
}