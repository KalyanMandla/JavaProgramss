package feb.ex_05032025_WrapperClass_Exceptions;

import java.io.FileInputStream;

public class Lab80_Exceptions {
    public static void main(String[] args) {


        //Checked Exceptions - JVM Knows
        // FileInputStream file = new FileInputStream("C://a.txt");
        // JVM knows this that file may not exist


        //UnChecked Exception - Arithmetic Exception
        int a = 10;
        int c = a/0;
        System.out.println(c);


    }
}
