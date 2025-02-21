package feb.ex_21022025;

public class Lab0022 {
    public static void main(String[] args) {
        boolean b = !true;
        if(b){
            System.out.println("b is true");
        }
        else{
            System.out.println("b is not true");
        }

        // Example-2
        boolean a = true;
        a = !a;
        if(2 + 2 < 4){
            System.out.println("Inside the loop");
        }
        System.out.println("Outside the loop");

        //Even or Odd
        int num = 11;
        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


    }
}
