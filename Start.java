import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean active = true;
        String expression;

        System.out.println("Enter expression here (type 'exit' to quit):");

        while (active) {
            expression = scanner.nextLine();
            if (expression.equalsIgnoreCase("exit")) {
                scanner.close();
                active = false;
            } else {
                System.out.println(Calculator.evaluateExpression(expression));
            }
        }
    }
}
