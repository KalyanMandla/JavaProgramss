package feb.ex_04032025_Strings;

public class Lab73_String_Functions {
    public static void main(String[] args) {
        String str = " Hello World ";

        //Length of the String
        System.out.println("Length: " + str.length()); // Length: 13

        // SubString
        System.out.println("SubString: " + str.substring(1, 5)); // SubString: Hell

        // Trim
        System.out.println("Trimmed: '" + str.trim() + "'"); // Trimmed: 'Hello World'

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase()); // Uppercase:  HELLO WORLD
        System.out.println("Lowercase: " + str.toLowerCase()); // Lowercase:  hello world

        // char and Index
        System.out.println(str.charAt(2)); // e
        System.out.println(str.indexOf("H")); // 1

        // Equals
        System.out.println(str.equals("Hello")); // false

        // contains
        System.out.println(str.contains("l")); // true
        System.out.println(str.contains("p")); // false
        System.out.println(str.isEmpty()); // false

        // comparison
        String name = "Pramod";
        String name2 = "Pramod";
        System.out.println(name.compareTo(name2));
        // CompareTo -> returns 0 - when both of them are same
        // Return Number -> ASCII value diff - between the strings
        // d -> D - lexicographically comparison

        System.out.println(name.strip());







    }
}
