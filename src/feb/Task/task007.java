package feb.Task;

import java.util.Scanner;

public class task007 {
    public static void main(String[] args) {
        //FizzBuzz Problem
        // Write a program that prints numbers from 1 to n(100).
        // However, for multiples of 3, print "Fizz" instead of number,
        // and for multiplies of 5, print "Buzz".
        // For numbers that are multiplies for both 3 and 5,
        // print "FizzBuzz".

        //Logic Building

        // step 1:
        // Input -> int - n -> n =100 - Scanner Class
        // Output -> String -> Fizz, Buzz and FizzBuzz - SOP

        // step 2:
        // Rough logic
        // for -> int i = 1 to i <= 100(n)
        // i -> multiple of 3 -> modulus - i%3 == 0 -> Fizz
        // i -> multiple of 5 -> modulus - i%5 == 0 -> Buzz
        // i -> multiple of 3, 5 -> modulus - i%5 && i%3 == 0 -> FizzBuzz

        // step 3: real logic
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = 100");
        int n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5 == 0){
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%3 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }




    }
}
