package Practice_4.dop.Exercise_10;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car(4, 500);
        double carTime = car.calculateTime();
        double carCost = car.calculateCost();
        System.out.println("Время и стоимость перевозки для автомобиля:");
        System.out.println("Время: " + carTime + " ч");
        System.out.println("Стоимость: " + carCost + " руб");

        Transport plane = new Plane(100, 2000);
        double planeTime = plane.calculateTime();
        double planeCost = plane.calculateCost();
        System.out.println("Время и стоимость перевозки для самолета:");
        System.out.println("Время: " + planeTime + " ч");
        System.out.println("Стоимость: " + planeCost + " руб");

        Transport train = new Train(30, 800);
        double trainTime = train.calculateTime();
        double trainCost = train.calculateCost();
        System.out.println("Время и стоимость перевозки для поезда:");
        System.out.println("Время: " + trainTime + " ч");
        System.out.println("Стоимость: " + trainCost + " руб");

        Transport ship = new Ship(200, 5000);
        double shipTime = ship.calculateTime();
        double shipCost = ship.calculateCost();
        System.out.println("Время и стоимость перевозки для корабля:");
        System.out.println("Время: " + shipTime + " ч");
        System.out.println("Стоимость: " + shipCost + " руб");
    }
}
