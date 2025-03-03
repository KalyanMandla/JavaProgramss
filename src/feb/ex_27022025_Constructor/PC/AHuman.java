package feb.ex_27022025_Constructor.PC;

public class AHuman {
    String eyes_color;
    String names;
    long aadhar_card_number;

    // Default Constructor
    AHuman(){
        System.out.println("I will be called, Object is created");
        // Write a code here which will automatically called when object is created
        // Read a file txt
        // Read a CSV, Excel here...
    }

    //Parameterized Constructor"
    AHuman(String name){
        System.out.println("Hi, I am a Parameterized Constructors");
    }

    void walk(){
        System.out.println("NRNA");
    }

    int talk(){
        System.out.println("RTNA");
        return 10;
    }

    String sleep(String name){
        System.out.println("Sleeping");
        System.out.println("RTWA");
        return "I am Sleeping";
    }

    void eat(String name){
        System.out.println("NRWA");
        System.out.println("Eating");
    }
}
