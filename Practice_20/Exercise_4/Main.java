package Practice_20.Exercise_4;

public class Main {
    public static void main(String[] args) {
        Double[] numbers = {3.2, 1.999,0.0, -6.2341, 1.34};
        MinMax minMax = new MinMax(numbers);
        System.out.println("Maximum element: " + minMax.findMax());
        System.out.println("Minimum element: " + minMax.findMin());

        int a = 9;
        int b = 3;
        int sum = Calculator.sum(a, b);
        System.out.println(sum);
        double sum2 = Calculator.sum(a, b);
        System.out.println(sum2);
        double div = Calculator.div(a, b);
        System.out.println(div);
    }
}
