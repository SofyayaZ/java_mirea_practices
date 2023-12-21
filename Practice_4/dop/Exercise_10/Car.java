package Practice_4.dop.Exercise_10;

public class Car extends Transport {
    public Car(double passengers, double cargo) {
        super(passengers, cargo);
    }

    @Override
    public double calculateTime() {
        return passengers * 0.1 + cargo * 0.05;
    }

    @Override
    public double calculateCost() {
        return passengers * 10 + cargo * 5;
    }
}
