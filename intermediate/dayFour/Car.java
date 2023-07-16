package intermediate.dayFour;

import java.util.HashMap;
import java.util.Map;

public class Car extends DetailsVehicle{

    private int numDoors;
    private String fuelType;

    public Car() {

    }

    public Car(int numDoors, String fuelType) {
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public Car(String make, String model, Integer year, Double price, int numDoors, String fuelType) {
        super(make, model, year, price);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    
    @Override
    public String toString() {
        return "Car [make=" + make + " model=" + model + " year=" + year + " price=" + price + " numDoors=" + numDoors + ", fuelType=" + fuelType + "]";
    }

    public HashMap<Integer, DetailsVehicle> displayDetails() {

        Map<Integer, DetailsVehicle> vehicleDetails = new HashMap<Integer, DetailsVehicle>();

        return (HashMap<Integer, DetailsVehicle>) vehicleDetails;
    
    }


}