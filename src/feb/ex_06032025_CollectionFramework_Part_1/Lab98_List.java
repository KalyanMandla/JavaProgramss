package feb.ex_06032025_CollectionFramework_Part_1;

import java.util.ArrayList;
import java.util.List;

public class Lab98_List {
    public static void main(String[] args) {
        // List list = new List();
//        List list = List.of("banana","mango","grapes","orange");
//        System.out.println(list);
//        System.out.println(list.size());
        // of is static method is Interface that can contain the defination

        List list = new ArrayList();
        list.add("bread"); // 0
        list.add("milk"); // 1
        list.add("butter"); // 2
        list.add("panneer"); // 3
        list.add("jam"); // 4
       // System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
       // System.out.println(list.contains(1)); // false
        System.out.println(list.contains("bread"));
        System.out.println(list.indexOf("milk"));
        System.out.println(list.lastIndexOf("jam"));

        System.out.println("---Default for loop ----");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---For each loop ----");

        for(Object o : list){
            System.out.println(o);
        }
    }
}
