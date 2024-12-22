public class CalculatorTest5 {

    // Static method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Static method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Static method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Static method for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        double a = 12.5, b = 4.2;

        System.out.printf("Addition of %.2f and %.2f is: %.2f\n", a, b, add(a, b));
        System.out.printf("Subtraction of %.2f from %.2f is: %.2f\n", b, a, subtract(a, b));
        System.out.printf("Multiplication of %.2f and %.2f is: %.2f\n", a, b, multiply(a, b));

        try {
            System.out.printf("Division of %.2f by %.2f is: %.2f\n", a, b, divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        double c = 0;
        try {
            System.out.printf("Division of %.2f by %.2f is: %.2f\n", a, c, divide(a, c));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}