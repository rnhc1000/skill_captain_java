package intermediate.dayFour;

import java.util.ArrayList;
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
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AbstractClasses {

    public static void main(String... args) {

        Map<Integer, Car> detailsCar = new HashMap<Integer, Car>();
        Map<Integer, Motorcycle> detailsBike = new HashMap<Integer, Motorcycle>();

        Scanner input = new Scanner(System.in);
        String make = "";
        String model = "";
        Integer year = 0;
        Double price = 0d;
        Integer numOfDoors = 0;
        String fuelType = "";
        boolean hasSidecar = false;
        String sidecar = "N";
        Integer power = 0;
        boolean isBike = true;
        int amountOfVehicles = 0;
        int inventory = 0;
        System.out.print("Inform the amount of Vehicles:-> ");
        amountOfVehicles = input.nextInt();
        input.nextLine();
        System.out.print("Please choose car or bike-> (car || bike)-> ");
        String type = input.nextLine();
        type = type.toLowerCase();

        for (int countOfVehicles = 1; countOfVehicles <= amountOfVehicles; countOfVehicles++) {

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
                System.out.print("Price-> ");
                price = input.nextDouble();
                System.out.print("Number Of Doors-> ");
                numOfDoors = input.nextInt();
                input.nextLine();
                detailsCar.put(countOfVehicles, new Car(
                        make, model, year, price, numOfDoors, fuelType));

                inventory++;
                System.out.println("Size of Inventory: -> " + inventory);

            } else if (type.equals("motorcycle") || type.equals("bike")) {
                System.out.print("Make-> ");
                make = input.nextLine();
                System.out.print("Model-> ");
                model = input.nextLine();
                System.out.print("Year-> ");
                year = input.nextInt();
                System.out.print("Price-> ");
                price = input.nextDouble();
                input.nextLine();
                System.out.print("Has Sidecar?-> (S/N) ");
                sidecar = input.nextLine();
                sidecar = sidecar.toLowerCase();
                hasSidecar = (sidecar.equals("sim") || sidecar.equals("s")) ? true : false;
                System.out.print("Power-> ");
                power = input.nextInt();
                detailsBike.put(countOfVehicles, new Motorcycle(
                        make, model, year, price, hasSidecar, power));
                inventory++;
                System.out.println("Size of Inventory: -> " + inventory);
                input.nextLine();
            }

        }

        if (!isBike) {

            // Car car = new Car("Mercedes-Benz", "C63-AMG4", 2012, 4, "gas");
            // Car car = new Car(make, model, year, price, numOfDoors, fuelType);

            for (Map.Entry<Integer, Car> set : detailsCar.entrySet()) {

                System.out.println(set.getKey() + " " + set.getValue());

            }

        } else {

            // Motorcycle motorcycle = new Motorcycle("Kawasaki", "Z-900", 2023, true, 250);
            // Motorcycle motorcycle = new Motorcycle(make, model, year, price, hasSidecar,
            // power);
            for (Map.Entry<Integer, Motorcycle> set : detailsBike.entrySet()) {

                System.out.println(set.getKey() + " " + set.getValue());

            }

        }

        System.out.print("Do you want to (R)emove or (E)dit a Vehicle? -> R/E ? ");
        String removedVehicle = "";
        String removeOrEdit = input.nextLine();
        removeOrEdit = removeOrEdit.toLowerCase();

        if (removeOrEdit.equals("r")) {

            System.out.print("Which Vehicle will be Removed ? (C)ar/(M)otorcycle -> C/M ?");
            removedVehicle = input.nextLine();
            removedVehicle = removedVehicle.toLowerCase();

            if (removedVehicle.equals("c")) {
                isBike = false;

                System.out.println("There are " + inventory + " cars available");
                detailsCar.forEach((key, value) -> System.out.println(key + " = " + value));
                System.out.print("Which one you want to remove -> ");
                int removeVehicle = input.nextInt();
                detailsCar.remove(removeVehicle);
                System.out.println("Vehicle Removed  New inventory");
                detailsCar.forEach((key, value) -> System.out.println(key + " = " + value));

            } else {

                System.out.println("There are " + inventory + " bikes available");
                detailsBike.forEach((key, value) -> System.out.println(key + " = " + value));
                System.out.print("Which one you want to remove -> ");
                int removeVehicle = input.nextInt();
                detailsBike.remove(removeVehicle);
                System.out.println("Vehicle Removed -> New inventory below!");
                detailsBike.forEach((key, value) -> System.out.println(key + " = " + value));

            }

        } else {

            System.out.println("This is the current inventory...!");

            if (!isBike) {

                for (Map.Entry<Integer, Car> set : detailsCar.entrySet()) {
                    System.out.println(set.getKey() + " " + set.getValue());
                }
            } else {

                for (Map.Entry<Integer, Motorcycle> set : detailsBike.entrySet()) {
                    System.out.println(set.getKey() + " " + set.getValue());
                }
                System.out.print("Which one of the inventory you want edit ? ");
                int vehicleToBeEdited = input.nextInt();
                input.nextLine();

                if (detailsBike.containsKey(vehicleToBeEdited)) {

                    System.out.print("Make-> ");
                    make = input.nextLine();
                    System.out.print("Model-> ");
                    model = input.nextLine();
                    System.out.print("Year-> ");
                    year = input.nextInt();
                    System.out.print("Price-> ");
                    price = input.nextDouble();
                    input.nextLine();
                    System.out.print("Has Sidecar?-> (S/N) ");
                    sidecar = input.nextLine();
                    sidecar = sidecar.toLowerCase();
                    hasSidecar = (sidecar.equals("sim") || sidecar.equals("s")) ? true : false;
                    System.out.print("Power-> ");
                    power = input.nextInt();
                    detailsBike.put(vehicleToBeEdited, new Motorcycle(
                            make, model, year, price, hasSidecar, power));
                    System.out.println("Vehicle Edited Succesfully! -> New inventory below!");
                    detailsBike.forEach((key, value) -> System.out.println(key + " = " + value));

                } else {
                    System.out.println("Vehicle Not Found... Bye!!!");

                }
            }
        }

    }
}
