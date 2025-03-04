package feb.ex_04032025_Strings;

public class Lab72_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello"; // String Constant Pool SCP
        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello");
        String s4 = "Hello";
        String s5 = new String("hello");

//        System.out.println(s1 == s2); // false
//        System.out.println(s2 == s3); // false
//        System.out.println(s1 == s4); // true
        // == This is checking the ref locations


        // How can I check the values ? equals == value
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3.equals(s5)); // false
        System.out.println(s3.equalsIgnoreCase(s5)); // true






    }
}
