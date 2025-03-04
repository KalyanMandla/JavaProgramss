package feb.ex_04032025_Strings;

public class Lab74_Immutable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat("World");
        System.out.println(str1); // Hello
        System.out.println(str2); // HelloWorld

    }
}
