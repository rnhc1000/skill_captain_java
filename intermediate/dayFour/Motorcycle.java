package intermediate.dayFour;

import java.util.HashMap;
import java.util.Map;

public class Motorcycle  extends DetailsVehicle {

    private boolean hasSidecar;
    private Integer engineCapacity;
    

    public Motorcycle(boolean hasSidecar, Integer engineCapacity) {
        this.hasSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
    }


    public Motorcycle(String make, String model, Integer year, Double price, boolean hasSidecar, Integer engineCapacity) {
        super(make, model, year,price);
        this.hasSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
    }


    public boolean isHasSidecar() {
        return hasSidecar;
    }


    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }


    public Integer getEngineCapacity() {
        return engineCapacity;
    }


    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    @Override
    public String toString() {
        return "Motorcycle [make=" + make + " model=" + model + " year=" + year + " hasSidecar=" + hasSidecar + " engineCapacity=" + engineCapacity + "]";
    }


    public HashMap<Integer, DetailsVehicle> displayDetails() {

        Map<Integer, DetailsVehicle> vehicleDetails = new HashMap<Integer, DetailsVehicle>();

        return (HashMap<Integer, DetailsVehicle>) vehicleDetails;
    }
}
