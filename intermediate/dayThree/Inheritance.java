package intermediate.dayThree;
/**
 * 
 * Assignment: Vehicle Rental System
 * Instructions:
 * Create a Java program to model a vehicle rental system using inheritance. 
 * The program should consist of a parent class called "Vehicle" and two 
 * child classes called "Car" and "Motorcycle".
 * Requirements:
 * 1. Create a class named "Vehicle" with attributes: 
 * brand, model, year, and rentalPrice.
 * - Implement a method to display the vehicle information.
 * 2. Create a class named "Car" that extends "Vehicle" with an 
 * additional attribute: numberOfSeats.
 * - Implement a method to retrieve the number of seats.
 * 3. Create a class named "Motorcycle" that extends "Vehicle" with an 
 * additional attribute: engineCapacity.
 * - Implement a method to retrieve the engine capacity.
 * 4. In the main class, create instances of "Car" and "Motorcycle" classes and demonstrate:
 * - Creating vehicles with specific attributes.
 * - Displaying the information of each vehicle.
 * 
 */
public class Inheritance {


    public static void main(String... args) {

        //Vehicle vehicle = new Vehicle("Mercedes", "C63AMG", 2012, 5757.57);
        Vehicle vehicle = new Vehicle();

        Car car = new Car(5);

        Motorcycle motorcycle = new Motorcycle(500);

        System.out.println(motorcycle.getEngineCapacity());

        motorcycle.setRentalPrice(7557.57);
        double priceMotorcyle = motorcycle.getRentalPrice();
        car.setBrand("Mercedes");
        System.out.println(car.getBrand());
        
    }

}

class Vehicle {


    private String brand;
    private String model;
    private Integer year;
    private double rentalPrice;

    public Vehicle() {

    }

    public Vehicle( String brand, String model, Integer year, double rentalPrice) {
        
        this.brand=brand;
        this.model= model;
        this.year=year;
        this.rentalPrice=rentalPrice;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + ", rentalPrice=" + rentalPrice + "]";
    }

    
    
}

class Car extends Vehicle {

    

    private Integer numberOfSeats;


    public Car(Integer numberOfSeats) {
        super();
        this.numberOfSeats=numberOfSeats;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

}

class Motorcycle extends Vehicle{


    private int engineCapacity;

    public Motorcycle(int engineCapacity) {

        this.engineCapacity=engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {

        this.engineCapacity=engineCapacity;
    }

    public int getEngineCapacity() {

        return this.engineCapacity;
    }

}