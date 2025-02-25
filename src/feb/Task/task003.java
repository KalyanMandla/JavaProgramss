package feb.Task;
import java.util.Scanner;

public class task003 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display menu options for the user
        System.out.println("Unit Conversion Options:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1-4): ");

        // Read user choice
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Kilometers to Miles
                System.out.print("Enter distance in kilometers: ");
                double km = scanner.nextDouble();
                double miles = km * 0.621371;
                System.out.println(km + " kilometers is equal to " + miles + " miles.");
                break;

            case 2: // Miles to Kilometers
                System.out.print("Enter distance in miles: ");
                double mi = scanner.nextDouble();
                double kilometers = mi / 0.621371;
                System.out.println(mi + " miles is equal to " + kilometers + " kilometers.");
                break;

            case 3: // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + "°C is equal to " + fahrenheit + "°F.");
                break;

            case 4: // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheitInput = scanner.nextDouble();
                double celsiusConverted = (fahrenheitInput - 32) * 5/9;
                System.out.println(fahrenheitInput + "°F is equal to " + celsiusConverted + "°C.");
                break;

            default:
                System.out.println("Invalid choice! Please select a number between 1 and 4.");
                break;
        }

        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}
