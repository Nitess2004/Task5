// Base class: Character
class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    // Method to be overridden
    public void attack() {
        System.out.println(name + " performs a basic attack.");
    }
}

// Derived class: Warrior
class Warrior extends Character {

    Warrior(String name) {
        super(name);
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println(name + " swings a mighty sword!");
    }
}

// Derived class: Mage
class Mage extends Character {

    Mage(String name) {
        super(name);
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println(name + " casts a powerful fireball!");
    }
}

// Main class to test the game characters
public class GameDemo {
    public static void main(String[] args) {
        // Create character instances
        Character basic = new Character("Adventurer");
        Character warrior = new Warrior("seeru");
        Character mage = new Mage("mameeee");

        // Demonstrate method overriding
        basic.attack();   // Basic attack
        warrior.attack(); // Warrior's sword attack
        mage.attack();    // Mage's spell attack
    }
}