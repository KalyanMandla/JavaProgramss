package feb.ex_26022025;

public class Lab0036 {
    public static void main(String[] args){
        // 1. Without Parameters and Without Return Type
        function_type1();

        // 2. Without Parameters but with Return Type
        String name = function_type2();
        System.out.println(name);

        // 3. With Parameters and Without Return Type
        function_type3("Kalyan");

        // 4. With Parameters amd With Return Type
        int result = function_type4(3,4);
        System.out.println(result);


    }

       // 1. Without Parameters and Without Return Type
       static void function_type1(){
           System.out.println("1. Without Parameters and Without Return Type");
       }

    // 2. Without Parameters but with Return Type
    public static String function_type2(){
        System.out.println("2. Without Parameters but with Return Type");
        return "Kalyan";
    }

    // 3. With Parameters and Without Return Type
    public static void function_type3(String name){
        System.out.println("3. With Parameters and Without Return Type");
        System.out.println("You have shared -> " + name);
    }

    // 4. With Parameters amd With Return Type
   static int function_type4(int a, int b){
       System.out.println("4. With Parameters amd With Return Type");
       return a+b;
   }

}
