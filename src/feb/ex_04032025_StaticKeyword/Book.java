package feb.ex_04032025_StaticKeyword;

abstract class Book {
    protected String name;
    protected String author;
    protected double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}
