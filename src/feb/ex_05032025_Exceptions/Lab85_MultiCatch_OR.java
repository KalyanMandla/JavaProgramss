package feb.ex_05032025_Exceptions;

public class Lab85_MultiCatch_OR {
    public static void main(String[] args) {

        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 1000/a; // Arithmetic Exception
            System.out.println(b);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("End");
        }
    }
}
