// Base class: Account
class Account {
    String accountHolder;
    double balance;

    // Constructor
    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to calculate interest (base version)
    public double calculateInterest() {
        // Generic base interest, e.g., 2%
        return balance * 0.02;
    }

    public void displayInterest() {
        System.out.println(accountHolder + "'s Interest: $" + calculateInterest());
    }
}

// Derived class: SavingsAccount
class SavingsAccount extends Account {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Override with 4% interest rate
    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}

// Derived class: FixedDepositAccount
class FixedDepositAccount extends Account {
    int termInYears;

    FixedDepositAccount(String accountHolder, double balance, int termInYears) {
        super(accountHolder, balance);
        this.termInYears = termInYears;
    }

    // Override with 6% annual interest multiplied by term
    @Override
    public double calculateInterest() {
        return balance * 0.06 * termInYears;
    }
}

// Main class to test the application
public class BankingSystem {
    public static void main(String[] args) {
        // Create different account types
        Account generic = new Account("Alex", 1000);
        Account savings = new SavingsAccount("Samantha", 2000);
        Account fixed = new FixedDepositAccount("Ravi", 5000, 3); // 3 years term

        // Display interest for each account
        generic.displayInterest();    // 2% of 1000
        savings.displayInterest();    // 4% of 2000
        fixed.displayInterest();      // 6% * 3 years * 5000
    }
}