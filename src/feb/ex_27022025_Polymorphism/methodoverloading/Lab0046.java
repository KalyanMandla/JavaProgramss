package feb.ex_27022025_Polymorphism.methodoverloading;

public class Lab0046 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int result = m.add(3,4);
        System.out.println("result");

        String name = m.add("kalyan", "mandla");
        System.out.println(name);

    }
}
