package feb.ex_05032025_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab89_UnChecked_Checked_Exceptions {
    public static void main(String[] args) {
        try {
            int a = 10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("UnChecked");
        }


        try {
            FileReader file = new FileReader("C://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Checked");
        }


    }
}
