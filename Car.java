public class Car extends Vehicle{

    String make = "Mercedes";
    String model = "A5";
    int year = 2021;
    String color = "Blue";
    double price = 5000000.0;
    int wheels = 4;
    int doors = 4;

    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You stepped on the brake");
    }

    String name;

    Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    @Override
    void start() {
        System.out.println("This car is started.");
    }
}