package feb.ex_05032025_Exceptions;

public class Lab90_Custom_Exception {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank icici=new Bank("INR",123);
        Bank jp_chase=new Bank("USD",100);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_chase));


    }
}
