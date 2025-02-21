package feb.ex_21022025;

public class Lab0017 {
    public static void main(String[] args) {
          // pre
//        int a = 10;
//        int result = ++a;
//        System.out.println(a);
//        System.out.println(result);

         // post
//        int a = 10;
//        int result = a++;
//        System.out.println(a);
//        System.out.println(result);

//         int a = 10;
//        System.out.println(a++ + a);

//          int a = 10;
//          System.out.println(a++ + ++a);
//        System.out.println(a);
          //A -> a++ -> 10, a = 11
          // +
          //B -> ++a ->12 , b = 12

//          int a = 10;
//          System.out.println(++a + ++a);
//          System.out.println(a);

          int a = 10;
          System.out.println(++a + a++ + ++a);
          System.out.println(a);
          //Part A - ++a -> exp1 = 11, a = 11
          //Part B - a++ -> exp2 = 11, a = 12
          //Part C - ++a -> exp3 = 12, a = 13

    }
}
