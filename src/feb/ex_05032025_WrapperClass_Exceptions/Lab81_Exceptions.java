package feb.ex_05032025_WrapperClass_Exceptions;

public class Lab81_Exceptions {
    public static void main(String[] args) {

        //Checked Exception
        int a = 10;
        int c = a/0; //java.lang.ArithmeticException terminated
        System.out.println(c);
        System.out.println("End");

    }
}
