package feb.Task;

public class task006 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check divisibility by all numbers from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
