package Practice_4.dop.Exercise_10;

public class Ship extends Transport {
    public Ship(double passengers, double cargo) {
        super(passengers, cargo);
    }

    @Override
    public double calculateTime() {
        // расчет времени для корабля
        return passengers * 0.1 + cargo * 0.02;
    }

    @Override
    public double calculateCost() {
        // расчет стоимости для корабля
        return passengers * 30 + cargo * 15;
    }
}