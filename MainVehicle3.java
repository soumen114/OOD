class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String brand, String model, int year, int numberOfDoors, String fuelType) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Bike extends Vehicle {
    private String bikeType;
    private int engineCapacity;

    public Bike(String brand, String model, int year, String bikeType, int engineCapacity) {
        super(brand, model, year);
        this.bikeType = bikeType;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Type: " + bikeType);
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}

public class MainVehicle3 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2021, 4, "Petrol");
        Bike bike = new Bike("Yamaha", "YZF-R3", 2020, "Sports", 321);

        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println("\nBike Details:");
        bike.displayInfo();
    }
}
