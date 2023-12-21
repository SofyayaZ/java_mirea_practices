package Practice_7.Exercise_4;

public class Main {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        double r = 5.0;
        double circumference = 2 * MathCalculable.PI * r;
        System.out.println("The length of the circumference: " + circumference);
    }
}
