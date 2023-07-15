package intermediate.dayFour;

import java.util.HashMap;

public abstract class DetailsVehicle {


        protected String make;
        protected String model;
        protected Integer year;
        protected Double price;



        public abstract HashMap<Integer, DetailsVehicle> displayDetails();

        public DetailsVehicle() {
        }

        public DetailsVehicle(String make, String model, Integer year, Double price) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
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

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "DetailsVehicle [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
        }

    }
