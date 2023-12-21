package Practice_22;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(calculator, view);

        calculator.setVisible(true);
    }

}