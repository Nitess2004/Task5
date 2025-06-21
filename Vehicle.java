public class Vehicle {
    private String name;
    private String engineNumber;
    private int wheels;
    private String body;

    // Constructor
    public Vehicle(String name, String engineNumber, int wheels, String body) {
        this.name = name;
        this.engineNumber = engineNumber;
        this.wheels = wheels;
        this.body = body;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for engineNumber
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    // Getter for engineNumber
    public String getEngineNumber() {
        return engineNumber;
    }

    // Setter for wheels
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // Getter for wheels
    public int getWheels() {
        return wheels;
    }

    // Setter for body
    public void setBody(String body) {
        this.body = body;
    }

    // Getter for body
    public String getBody() {
        return body;
    }
}
