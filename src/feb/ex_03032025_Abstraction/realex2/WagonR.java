package feb.ex_03032025_Abstraction.realex2;

public class WagonR extends Engine{

    void driver(){
        startEngine();
        stopEngine();
    }


    @Override
    void startEngine() {
        System.out.println("Starting Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Car");
    }


}
