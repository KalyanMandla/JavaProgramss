package feb.ex_06032025_CollectionFramework_Part_2;

import java.util.Stack;

public class Lab106_Stack {
    public static void main(String[] args) {
//        Stack books = new Stack();
//        books.push("Python");
//        books.push("Java");
//        books.push("C#");
//        System.out.println(books);
//       // System.out.println(books.pop());
//        System.out.println(books.peek());
//        System.out.println(books);
//        System.out.println(books.pop()); // Remove
//        System.out.println(books);


        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit1");
        s.add("Amit2");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.add("Kalyan"));

        System.out.println("----");
        System.out.println(s);
        s.add(0,"Lucky");
        System.out.println(s);
        System.out.println(s.get(0));




    }
}
