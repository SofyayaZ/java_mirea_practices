package Practice_4.dop.Exercise_10;

public class Plane extends Transport {
    public Plane(double passengers, double cargo) {
        super(passengers, cargo);
    }

    @Override
    public double calculateTime() {
        // расчет времени для самолета
        return passengers * 0.05 + cargo * 0.01;
    }

    @Override
    public double calculateCost() {
        // расчет стоимости для самолета
        return passengers * 50 + cargo * 20;
    }
}
