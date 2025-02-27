package feb.Task;

import java.util.Scanner;

public class task004_Table {
    public static void main(String[] args) {
        // Table of number n= 10, print table with for or while
//        int n = 10;
//        System.out.println("Multiplication Table for " + n + " is: ");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n*i));
//        }

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = sc.nextInt();
        System.out.println("Mul of Table");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }



    }
}
