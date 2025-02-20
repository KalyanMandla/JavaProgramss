package feb.ex_19022025;

public class Lab007 {
    public static void main(String[] args){
        // %d - any integer, byte, short, long
        // %s - String
        // %c - char
        // %f - float, double
        int num = 10;
        System.out.printf("Multiplication table of %d:\n", num);

        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

    }


}
