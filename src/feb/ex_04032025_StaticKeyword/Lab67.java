package feb.ex_04032025_StaticKeyword;

public class Lab67 {
    public static void main(String[] args) {
        ATB s1 = new ATB("Kalyan");
        ATB s2 = new ATB("Murali");
        ATB s3 = new ATB("Ram");
        ATB s4 = new ATB("Krishna");

        ATB s5;
        new ATB("Pramod");

        s1.readDocuments();
        s2.readDocuments();

        ATB.doAssignment();


    }
}

class ATB{

    {
        System.out.println("IIB");
        // What is the Purpose ?
        // Here you can write the code related to
        // start a website or anything before starting the
        // web automation or api automation

        System.out.println("Reading from CSV file");
    }

    static{
        System.out.println("Load the Class, I will execute");
    }

    private String name;
    private String phone;
    static String courseName = "ATB8x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }


}
