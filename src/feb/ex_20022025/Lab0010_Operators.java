package feb.ex_20022025;

public class Lab0010_Operators {
    public static void main(String[] args) {
        int age = 27;
        // = Assignment operator
        // right value to variable

        // Arithmetic operators
        // +, - , *, /, % - modulus - remainder
        int a = 10;
        int b = 4;
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        //Concatenation Operator +
        // + -> int + int -> math
        // + -> String -> combine -> concat
        String first_name = "Kalyan";
        String last_name = "Mandla";
        int c =10;
        int d = 10;
        System.out.println(first_name + last_name + c + d);
        System.out.println(first_name + last_name + (c + d));
        System.out.println(c + d + first_name + last_name);



    }
}
