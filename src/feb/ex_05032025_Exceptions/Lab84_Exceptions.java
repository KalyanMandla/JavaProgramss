package feb.ex_05032025_Exceptions;

public class Lab84_Exceptions {
    public static void main(String[] args) {

        int a = 0;
        try{
            int c = 10/a; // Arithmetic Exception
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always executed");
        }


    }
}
