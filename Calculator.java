import java.util.List;
import java.util.ArrayList;

public class Calculator {

    static float finalResult;

    static class Operations {

        static final char ADDITION_SYMBOL = '+';
        static final char SUBTRACTION_SYMBOL = '-';
        static final char MULTIPLICATION_SYMBOL = '*';
        static final char DIVISION_SYMBOL = '/';

        private Operations() {
        }

        public static String ToString() {
            return "" + ADDITION_SYMBOL + MULTIPLICATION_SYMBOL + DIVISION_SYMBOL + SUBTRACTION_SYMBOL;
        }

    }

    public static String evaluateExpression(String expression) {
        // get all entered numbers in string format
        // if expression starts with + or -, just add one zero at the beginning
        if (expression.charAt(0) == Operations.ADDITION_SYMBOL
                || expression.charAt(0) == Operations.SUBTRACTION_SYMBOL) {
            expression = 0 + expression;
        }

        // split expression by arithmetic operation to get all digits
        String[] numbers = expression.split("[" + Operations.ToString() + "]");

        // parse all operations
        List<String> operationList = new ArrayList<>();
        for (int i = 0; i < expression.length() - 1; i++) {
            if (expression.charAt(i) == Operations.ADDITION_SYMBOL
                    || expression.charAt(i) ==
