class Car {
    String make;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating first car object
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;
        car1.displayDetails();

        System.out.println();

        // Creating second car object
        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Accord";
        car2.year = 2023;
        car2.displayDetails();
    }
}
