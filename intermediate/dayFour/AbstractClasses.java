package intermediate.dayFour;

/**
 * Assignment: Abstract Class - Vehicle Inventory System
 * You have been tasked with creating a vehicle inventory system that can store 
 * and manage information about different types of vehicles. 
 * Follow the instructions below to complete the assignment:
 * 1. Create an abstract class called `Vehicle` with the following attributes and methods:
 * - Attributes:
 * - `make` (String): Represents the make of the vehicle.
 * - `model` (String): Represents the model of the vehicle.
 * - `year` (int): Represents the year of manufacture of the vehicle. 
 * - `price` (double): Represents the price of the vehicle.
 * - Methods:
 * - `displayDetails()`: Abstract method that should be implemented 
 *    by the subclasses to display the details of the vehicle.
 * 
 * 2. Create two subclasses of `Vehicle`: `Car` and `Motorcycle`. 
 *    Each subclass should inherit from the `Vehicle` class and add its own specific 
 *    attributes and methods:
 * - `Car`:
 * - Additional attributes:
 *  `numDoors` (int): Represents the number of doors the car has.
 * - `fuelType` (String): Represents the type of fuel the car uses.
 * - Additional methods:
 * - `calculateMileage()`: Calculates and returns the mileage of the car based 
 *    on certain criteria.
 * - `Motorcycle`:
 * - Additional attributes:
 * - `hasSidecar` (boolean): Indicates whether the motorcycle has a sidecar or not. 
 * - `engineCapacity` (int): Represents the engine capacity of the motorcycle. 
 * - Additional methods:
 * - `calculateSpeed()`: Calculates and returns the top speed of the motorcycle 
 *    based on certain criteria.
 * 
 * 3. In the `displayDetails()` method of each subclass, override the method from 
 *    the `Vehicle` class to display the specific details of the car or motorcycle, 
 *    including the additional attributes.
 * 
 * 4. In the `Main` class, create an inventory system where you can add and manage 
 *   different vehicles. Implement the following functionalities:
 * - Allow the user to add vehicles to the inventory by providing details such as make, 
 *   model, year, price, and any specific attributes related to the vehicle type.
 * - Provide an option to display the details of all the vehicles in the inventory.
 * - Implement a search functionality that allows the user to search for a vehicle 
 *   based on a specific criteria (e.g., make, model, price range).
 * - Allow the user to update the details of a specific vehicle in the inventory.
 * - Implement a feature to remove a vehicle from the inventory.
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AbstractClasses {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        String make = "";
        String model = "";
        Integer year = 0;
        Integer numOfDoors = 0;
        String fuelType = "";
        boolean hasSidecar = false;
        Integer power = 0;
        boolean isBike = true;
        System.out.print("Please choose car or bike-> (car || bike)-> ");
        String type = input.nextLine();
        type = type.toLowerCase();
        if (type.equals("car")) {
            isBike = false;
            System.out.print("Make-> ");
            make = input.nextLine();
            System.out.print("Model-> ");
            model = input.nextLine();
            System.out.print("Fuel Type-> ");
            fuelType = input.nextLine();
            System.out.print("Year-> ");
            year = input.nextInt();
            System.out.print("Number Of Doors-> ");
            numOfDoors = input.nextInt();

        } else if (type.equals("motorcycle") || type.equals("bike")) {
            System.out.print("Make-> ");
            make = input.nextLine();
            System.out.print("Model-> ");
            model = input.nextLine();
            System.out.print("Year-> ");
            year = input.nextInt();
            System.out.print("Has Sidecar?-> ");
            hasSidecar = input.nextBoolean();
            System.out.print("Power-> ");
            power = input.nextInt();
        }

        if (!isBike) {

            // Car car = new Car("Mercedes-Benz", "C63-AMG4", 2012, 4, "gas");
            Car car = new Car(make, model, year, numOfDoors, fuelType);
            System.out.println(car);

        } else {

            // Motorcycle motorcycle = new Motorcycle("Kawasaki", "Z-900", 2023, true, 250);
            Motorcycle motorcycle = new Motorcycle(make, model, year, hasSidecar, power);
            System.out.println(motorcycle);

        }

    }

}
