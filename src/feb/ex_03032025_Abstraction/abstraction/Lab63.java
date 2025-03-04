package feb.ex_03032025_Abstraction.abstraction;

public class Lab63 {

}

interface I1{}
interface I2{}
class A{}
class B{}
class Test1 extends A{} // single inheritance
//class Test2 extends A, B{} // Multiple Never possible using class
class Test3 implements I1{}
class Test4 implements I1,I2{} // Multiple inheritance possible using interface
class Test5 extends A implements I1,I2{} // possible
//class Test6 implements I1 extends A{} // not possible





