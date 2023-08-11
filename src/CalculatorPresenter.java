
public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        Number firstNumber = view.getInputNumber();
        char operator = view.getInputOperator();
        Number secondNumber = view.getInputNumber();

        switch (operator) {
            case '+':
                model.add(firstNumber, secondNumber);
                break;
            case '-':
                model.subtract(firstNumber, secondNumber);
                break;
            case '*':
                model.multiply(firstNumber, secondNumber);
                break;
            case '/':
                model.divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        view.displayResult(model.getResult());
    }
}