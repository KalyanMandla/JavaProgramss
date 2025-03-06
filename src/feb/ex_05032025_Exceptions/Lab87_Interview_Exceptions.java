package feb.ex_05032025_Exceptions;

public class Lab87_Interview_Exceptions {
    public static void main(String[] args) {

        try{
            String s1 = "Pramod";
            String a1 = args[0];
            int a = 10/0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with code");
            System.out.println(e.getMessage());
        }

    }
}
