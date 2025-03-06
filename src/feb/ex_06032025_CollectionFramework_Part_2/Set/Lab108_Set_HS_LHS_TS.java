package feb.ex_06032025_CollectionFramework_Part_2.Set;

import java.util.*;

public class Lab108_Set_HS_LHS_TS {
    public static void main(String[] args) {
        // Set - Duplicate values not allowed
        // List - Allows Duplicate

        Set hs = new HashSet(); // Hashing mechanism to store the elements, no order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);


        Set lhs = new LinkedHashSet(); // LinkedHashSet mechanism to store the elements, order will maintain
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.size());


        Set ts = new TreeSet(); // Black and Red Tree mechanism to store the elements, order will maintain
        // Order will maintain, Natural Sorting is dones
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("Watermelon");
        // ts.add(null); // not allowed
        System.out.println(ts);

        for(Object o : ts){
            System.out.println(o);
        }

        System.out.println("------");

        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}