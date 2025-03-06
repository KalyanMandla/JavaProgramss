package feb.ex_05032025_WrapperClass_Exceptions;

public class Lab79_Exceptions {
    public static void main(String[] args) {
        System.out.println("Starting of the Program");
//        String ip = args[0]; // 10
//        String ip1 = args[1]; // 11
//        String ip2 = args[2]; // 12
//        System.out.println(ip);
//        System.out.println(ip1);
//        System.out.println(ip2);

        String ip = args[0]; // 10
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End of the Program");


        // JVM will be Initialized (From RAM)
        // Creates and Starts the main Thread. - Main called
        // 1) Collects the Command Line Arguments - 10
        // String[] args = { 10 }
        // 2) Lab79_Exceptions.main()
        // Now control will be transferred to main thread to main method

        // When the problem comes in main - JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program





    }
}
