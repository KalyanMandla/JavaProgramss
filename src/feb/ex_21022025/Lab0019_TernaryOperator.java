package feb.ex_21022025;

public class Lab0019_TernaryOperator {
    public static void main(String[] args) {
        // Condition ? Expression_if_true : Expression_if_false
//        int a1 = (30 > 40) ? 10 : 20;
//        System.out.println(a1);

          int a = 10;
          int b = 20;
          int max = a > b ? a : b;
          int min = a < b ? a : b;
        System.out.println(max);
        System.out.println(min);

    }
}
