package feb.ex_05032025_Exceptions;

public class Lab88_Interview_Exception_2 {
    public static void main(String[] args) {

        final double pi = 3.14;
        int a = 0;
        try{
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by Zero");
        }finally {
            System.out.println("I will be executed anyHow!");
        }

    }
}
