package Practice_22;

public class CalculatorController {
    Calculator model;
    CalculatorView view;

    public CalculatorController(Calculator model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }
    public String getExpression() {
        return model.getExpression();
    }
    public double getResult() {
        return model.getResult();
    }

    public void updateView() {
        view.printDetails(getExpression(), getResult());
    }
}
