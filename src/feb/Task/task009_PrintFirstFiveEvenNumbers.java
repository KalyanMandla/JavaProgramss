package feb.Task;

public class task009_PrintFirstFiveEvenNumbers {
    public static void main(String[] args) {
        // Print the First 5 Even numbers
//        int count = 0;
//        int number = 2;
//         do{
//             System.out.println(number);
//             number += 2;
//             count++;
//         }while(count < 5);


        //using while
//        int count = 0;
//        int number = 2;
//        while(count < 5){
//            if(number % 2 == 0){
//                System.out.println(number);
//                count++;
//            }
//            number++;
//        }


        //Do while
        int count = 0;
        int number = 2;
        do{
            if(number % 2 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }while(count < 5);

    }

}
