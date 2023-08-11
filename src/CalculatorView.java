import java.util.Scanner;


public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    public Number getInputNumber() {
        System.out.print("Enter a number: ");
        String input = scanner.next();
        return Double.parseDouble(input);
    }

    public char getInputOperator() {
        System.out.print("Enter an operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void displayResult(Number result) {
        System.out.println("Result: " + result.toString());
    }
}