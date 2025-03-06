package feb.ex_05032025_Exceptions;

public class Lab86_Parent {
    public static void main(String[] args) {

        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 1000/a; // ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
