// Base class: Employee
class Employee {
    String name;
    double baseSalary;

    // Constructor
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to calculate salary (no bonus)
    public double calculateSalary() {
        return baseSalary;
    }

    public void displaySalary() {
        System.out.println(name + "'s Salary: $" + calculateSalary());
    }
}

// Derived class: Manager
class Manager extends Employee {
    double performanceBonus;

    // Constructor
    Manager(String name, double baseSalary, double performanceBonus) {
        super(name, baseSalary); // Call Employee constructor
        this.performanceBonus = performanceBonus;
    }

    // Override calculateSalary() to include bonus
    @Override
    public double calculateSalary() {
        return baseSalary + performanceBonus;
    }
}

// Main class 
public class PayrollSystem {
    public static void main(String[] args) {
        // Regular employee
        Employee emp = new Employee("Alice", 3000);

        // Manager with performance bonus
        Manager mgr = new Manager("Bob", 4000, 1000);

        // Display salaries
        emp.displaySalary();   // Output: Alice's Salary: $3000.0
        mgr.displaySalary();   // Output: Bob's Salary: $5000.0
    }
}