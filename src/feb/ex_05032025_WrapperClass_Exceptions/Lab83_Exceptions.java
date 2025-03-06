package feb.ex_05032025_WrapperClass_Exceptions;

public class Lab83_Exceptions {
    public static void main(String[] args) {

        int c = 0;
        try{
            c = 10/c;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e); // / by zero
        }


        try {
            String s1 = null;
            s1.trim();
        } catch (NullPointerException e) {
            System.out.println(e);
        }


        System.out.println("End");

    }
}
