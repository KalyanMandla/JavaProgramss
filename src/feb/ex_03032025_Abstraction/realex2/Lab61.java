package feb.ex_03032025_Abstraction.realex2;

public class Lab61 {
    public static void main(String[] args) {
       // I1 i = new I1();

//        ABC abc = new ABC();
//        abc.f4();

        XYZ xyz = new XYZ();
        xyz.display();

    }
}

class XYZ {
    void display(){
        new ABC().f4();
    }
}


class ABC implements I1, I2{

    @Override
    public void f1() {
        System.out.println("f1");
    }

    @Override
    public void f2() {
        System.out.println("f2");
    }

    @Override
    public void f3() {
        System.out.println("f3");
    }

    @Override
    public void f4() {
        System.out.println("f4");
    }
}


interface I1{
    void f1();
    void f2();

}

interface I2{
    void f3();
    void f4();

}
