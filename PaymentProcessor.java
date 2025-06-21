
abstract class PaymentMethod {
    // Method to validate payment details
    abstract boolean validate();

    // Method to process the payment
    abstract void processPayment(double amount);
}

// Credit Card class
class CreditCard extends PaymentMethod {
    String cardNumber;
    String expiryDate;

    // Constructor
    CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    // Validation for credit card
    boolean validate() {
        System.out.println("Validating Credit Card...");
        if (cardNumber.length() == 16 && expiryDate.length() == 5) {
            return true;
        }
        return false;
    }

    // Process payment
    void processPayment(double amount) {
        if (validate()) {
            System.out.println("Payment of $" + amount + " made using Credit Card.");
        } else {
            System.out.println("Credit Card details are invalid!");
        }
    }
}

// PayPal class
class PayPal extends PaymentMethod {
    String email;
    String password;

    PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    boolean validate() {
        System.out.println("Validating PayPal...");
        if (email.contains("@") && password.length() >= 6) {
            return true;
        }
        return false;
    }

    void processPayment(double amount) {
        if (validate()) {
            System.out.println("Payment of $" + amount + " made using PayPal.");
        } else {
            System.out.println("PayPal details are invalid!");
        }
    }
}

// Bank Transfer class
class BankTransfer extends PaymentMethod {
    String accountNumber;
    String bankCode;

    BankTransfer(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    boolean validate() {
        System.out.println("Validating Bank Transfer...");
        if (accountNumber.length() == 10 && bankCode.length() == 6) {
            return true;
        }
        return false;
    }

    void processPayment(double amount) {
        if (validate()) {
            System.out.println("Payment of $" + amount + " made using Bank Transfer.");
        } else {
            System.out.println("Bank Transfer details are invalid!");
        }
    }
}

// Main class
public class PaymentProcessor {
    public static void main(String[] args) {
        // Create different payment objects
        PaymentMethod payment1 = new CreditCard("1234567890123456", "12/25");
        PaymentMethod payment2 = new PayPal("user@example.com", "mypassword");
        PaymentMethod payment3 = new BankTransfer("1234567890", "123456");

        // Process payments
        payment1.processPayment(100.0);
        payment2.processPayment(200.0);
        payment3.processPayment(300.0);
    }
}