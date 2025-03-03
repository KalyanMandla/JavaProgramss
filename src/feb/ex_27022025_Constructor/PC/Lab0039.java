package feb.ex_27022025_Constructor.PC;

public class Lab0039 {
    public static void main(String[] args) {
        Dog gs = new Dog("GS","Lucky", 2 , 4);
        System.out.println(gs.breed);
        System.out.println(gs.name);
        System.out.println(gs.legs);
        System.out.println(gs.age);

        Dog bd = new Dog("BD");
        System.out.println(bd.breed);
        System.out.println(bd.name);
        System.out.println(bd.legs);
        System.out.println(bd.age);



    }
}
