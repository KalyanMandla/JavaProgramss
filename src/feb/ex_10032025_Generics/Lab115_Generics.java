package feb.ex_10032025_Generics;

public class Lab115_Generics {
    public static void main(String[] args) {
        temp(12);
        temp("parmod");
        temp(true);

    }

    public static <T> void temp(T a){
        System.out.println(a);
    }


}


