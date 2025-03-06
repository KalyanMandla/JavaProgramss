package feb.ex_06032025_CollectionFramework_Part_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab102_Vector {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5);
        mylist1.add("Pramod");
        mylist1.add("Kalyan");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        System.out.println(mylist1);

        Vector v = new Vector();
        v.add("Pramod"); // t1
        v.add("Kalyan"); // t1
        v.add("Kiran"); // t1
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Kiran"));
        System.out.println(v.lastIndexOf("Kiran"));
        System.out.println(v.contains("Kiran"));


        // Only problem with the Vector
        // It is Thread Safe, Synchronize
        // It will be time-consuming
        // One-by-One usage
        // Slower





    }
}
