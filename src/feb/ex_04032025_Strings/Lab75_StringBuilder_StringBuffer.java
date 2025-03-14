package feb.ex_04032025_Strings;

public class Lab75_StringBuilder_StringBuffer {
    public static void main(String[] args) {
//        String name = "Pramod";
//        name = "Aramod";

        // final class StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuffer stringBuffer1 = new StringBuffer("Dutta");
        stringBuffer.append("Dutta");
        stringBuffer1.append("Pramod");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);


        //C1, C2 - Toy
        // C1 - Toy 2 -> C2 Toy -> 2 - syn - Thread Safety - slow

        StringBuilder sb = new StringBuilder("Hello");

        //Appending to StringBuilder
        sb.append("World");
        System.out.println(sb);

        // Inserting StringBuilder
        sb.insert(5,",");
        System.out.println(sb);

        //Delete from StringBuilder
        sb.delete(5,6);
        System.out.println(sb);

        //Reversing StringBuilder
        sb.reverse();
        System.out.println(sb);



    }
}
