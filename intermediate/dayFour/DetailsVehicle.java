package intermediate.dayFour;

import java.util.HashMap;

public abstract class DetailsVehicle {


        protected String make;
        protected String model;
        protected Integer year;

        public abstract HashMap<Integer, DetailsVehicle> displayDetails();

        public DetailsVehicle() {
        }

        public DetailsVehicle(String make, String model, Integer year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
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

        @Override
        public String toString() {
            return "DetailsVehicle [make=" + make + ", model=" + model + ", year=" + year + "]";
        }

    }
