package feb.ex_04032025_StaticKeyword;

public class PrintMyBook extends Book{

    public PrintMyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);


    }
}
