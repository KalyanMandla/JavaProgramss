package feb.ex_25022025;

public class Lab0025 {
    public static void main(String[] args) {
        //switch condition
        // Days - 1 to 7 -> 1 mon, 2 tue, 7 sun.....
        int day = 1;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, what day its");
                break;
        }
        System.out.println("End of the Loop");


        //Web Automation
        //I will ask user which browser you want ne to run the code
        //Chrome -> execute chrome
        //firefox -> execute of fire
        //edge -> edge cases

        String browser = "chrome";
        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                //Further code to start the chrome
                //Webdriver driver = new Chrome(); // selenium code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                //Further code to start the firefox
                //Webdriver driver = new Firefox(); // selenium code
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                //Further code to start the edge
                //Webdriver driver = new Edge(); // selenium code
                break;
            default:
                System.out.println("I have not idea which browser is this..");
                break;

        }

    }
}
