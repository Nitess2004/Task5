// Base class: Instrument
abstract class Instrument {
    String name;

    Instrument(String name) {
        this.name = name;
    }

    // Abstract method to be overridden by each instrument
    abstract void playSound();
}

// Derived class: Piano
class Piano extends Instrument {
    Piano(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " plays a soothing piano melody.");
    }
}

// Derived class: Guitar
class Guitar extends Instrument {
    Guitar(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " strums a rhythmic guitar chord.");
    }
}

// Derived class: Violin
class Violin extends Instrument {
    Violin(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " plays a beautiful violin tune.");
    }
}

// Main class to test the application
public class MusicApp {
    public static void main(String[] args) {
        // Polymorphic references
        Instrument piano = new Piano("Yamaha Piano");
        Instrument guitar = new Guitar("Fender Guitar");
        Instrument violin = new Violin("Stradivarius Violin");

       
        piano.playSound();   
        guitar.playSound();  
        violin.playSound();  
    }
}