package feb.Task;
import java.util.Scanner;

public class task001 {
   public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user for second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user for the operation (operator)
        System.out.print("Enter the operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        // Perform the calculation using a switch statement
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Error: Invalid operator!");
                break;
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
