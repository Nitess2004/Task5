
abstract class MenuItem {
    String name;

    MenuItem(String name) {
        this.name = name;
    }
    abstract void prepare();
    abstract void serve();
}

// Appetizer class
class Appetizer extends MenuItem {

    Appetizer(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing appetizer: " + name + " (cold or light cooking).");
    }

    @Override
    void serve() {
        System.out.println("Serving appetizer: " + name + " with dipping sauce.");
    }
}

// Main Course class
class MainCourse extends MenuItem {

    MainCourse(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing main course: " + name + " (full cooking involved).");
    }

    @Override
    void serve() {
        System.out.println("Serving main course: " + name + " with side dishes.");
    }
}

// Beverage class
class Beverage extends MenuItem {

    Beverage(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing beverage: " + name + " (pouring/chilling).");
    }

    @Override
    void serve() {
        System.out.println("Serving beverage: " + name + " in a glass.");
    }
}

// Main class to test the ordering system
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        
        MenuItem item1 = new Appetizer("Spring Rolls");
        MenuItem item2 = new MainCourse("Grilled Chicken");
        MenuItem item3 = new Beverage("Lemonade");

        
        System.out.println("\n--- Processing Orders ---");
        processOrder(item1);
        processOrder(item2);
        processOrder(item3);
    }
    public static void processOrder(MenuItem item) {
        item.prepare();
        item.serve();
        System.out.println();
    }
}