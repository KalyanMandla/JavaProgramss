package feb.ex_27022025_Polymorphism.methodoverriding.real;

public class Lab0048 {
    public static void main(String[] args) {
//        Pramod p = new Pramod();
//        p.home();
//
//        Father f = new Father();
//        f.home();

        // Dynamic Dispatch
        Father object = new Pramod();
        object.home();

        //Not Possible
        // Pramod object = new Father();


    }
}
