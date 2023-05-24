public class Car {
        public String make;
        public String model;
        public int mileage;
        public String colour;
        // generally, in production code, fields would be private (encapsulated)

        public Car(String make, String model, int mileage, String colour) {
            this.make = make;
            this.model = model;
            this.mileage = mileage;
            this.colour = colour;
        }
        public Car(){}

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", colour='" + colour + '\'' +
                '}';
    }
}
