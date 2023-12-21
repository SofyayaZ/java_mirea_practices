package Practice_4.dop.Exercise_10;

public class Train extends Transport {
    public Train(double passengers, double cargo) {
        super(passengers, cargo);
    }

    @Override
    public double calculateTime() {
        // расчет времени для поезда
        return passengers * 0.02 + cargo * 0.01;
    }

    @Override
    public double calculateCost() {
        // расчет стоимости для поезда
        return passengers * 15 + cargo * 10;
    }
}
