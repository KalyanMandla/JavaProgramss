package feb.ex_27022025_Constructor.PC;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    // Default constructor
    Dog(){
        System.out.println("I am DC");
        System.out.println("God is happy!!");
    }

    Dog(String breed){
        System.out.println("I am PC");
        this.breed = breed;
    }

    Dog(String breed, String name, int legs, int age){
        System.out.println("I am PC");
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs = legs;

    }

    void walk(){

    }

}
