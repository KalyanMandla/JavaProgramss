package feb.ex_06032025_CollectionFramework_Part_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab101_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Anil");
        mylist.add("Amit");

        System.out.println(" - To Print ArrayList - 1 ");

        for(String str : mylist){
            System.out.println(str);
        }

        System.out.println(" - To Print ArrayList - 2 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println(" - To Print ArrayList - 3 ");

        // Iterator
        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
