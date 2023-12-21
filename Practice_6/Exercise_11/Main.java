package Practice_6.Exercise_11;

public class Main {
    public static void main(String[] args) {
        double t = 20;
        CelsiusToKelvin Convert1 = new CelsiusToKelvin();
        CelsiusToFahrenheit Convert2 = new CelsiusToFahrenheit();
        System.out.print("20 degrees Celsius equals ");
        System.out.print(Convert1.convert(t)+ " degrees Kelvin or ");
        System.out.print(Convert2.convert(t)+ " degrees Fahrenheit.");
    }
}
