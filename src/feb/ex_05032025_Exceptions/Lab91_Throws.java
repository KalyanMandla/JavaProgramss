package feb.ex_05032025_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab91_Throws {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("data.txt");

    }
}
