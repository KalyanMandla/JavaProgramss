package feb.ex_03032025_Abstraction.realex2;

public class Lab0060 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();

        // I i = new I(); not possible
    }
}

class P implements I{

    @Override
    public void f1() {
        System.out.println("Created P");
    }
}

interface I{
    void f1();
}
