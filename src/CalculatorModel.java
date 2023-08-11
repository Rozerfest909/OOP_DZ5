
public class CalculatorModel {
    private Number result;

    public CalculatorModel() {
        this.result = 0;
    }

    public void add(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public void subtract(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() - secondNumber.doubleValue();
    }

    public void multiply(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() * secondNumber.doubleValue();
    }

    public void divide(Number firstNumber, Number secondNumber) {
        if (secondNumber.doubleValue() != 0) {
            result = firstNumber.doubleValue() / secondNumber.doubleValue();
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }
}