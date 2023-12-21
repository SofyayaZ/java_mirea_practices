package Practice_4.dop.Exercise_10;

public abstract class Transport {
    protected double passengers;
    protected double cargo;

    public Transport(double passengers, double cargo) {
        this.passengers = passengers;
        this.cargo = cargo;
    }

    public abstract double calculateTime();
    public abstract double calculateCost();
}
