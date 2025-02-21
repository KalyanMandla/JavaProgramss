package feb.ex_21022025;

public class Lab0014 {
    public static void main(String[] args) {
        // Type Casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b = 10;
        int a = b; // Valid - Implicit casting - JVM
        int a1 = (int)b; // Valid - Explicit casting - JVM

        //Narrowing
        int val = 300;
        //byte b1 = val; // Invalid Implicit casting - JVM
        byte b2 = (byte)val; // Invalid Explicit casting - loss of data
        System.out.println(b2);



    }
}
