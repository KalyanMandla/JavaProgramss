package feb.Task;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task002_PrintMonth {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader object for user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user for an integer input between 1 and 12
        System.out.print("Enter a number (1 - 12): ");
        int monthNumber = Integer.parseInt(reader.readLine()); // Read input as an integer

        // Switch statement to print the corresponding month
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error: Please enter a number between 1 and 12.");
                break;
        }
    }
}
