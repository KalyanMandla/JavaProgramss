package feb.Task;

public class task0010_SumOfNumbers {
    public static void main(String[] args) {
        // Calculate the Sum of Numbers from 1 to 100
        int sum = 0;
        int i = 1;
        while(i <= 100){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

    }
}
