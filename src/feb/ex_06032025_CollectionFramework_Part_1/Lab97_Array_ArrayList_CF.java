package feb.ex_06032025_CollectionFramework_Part_1;

import java.util.ArrayList;

public class Lab97_Array_ArrayList_CF {
    public static void main(String[] args) {
        // Collection - interface ( 10 )
        // List - interface - 15 ( 25 )
        // ArrayList, LinkedList, Stack and Vector

        //Shopping - bread, milk, panneer, buttermilk, butter
        // Collection of items - with same or different data type
        // Collection of Students

        ArrayList studentList = new ArrayList();
        studentList.add("Pramod");
        studentList.add("Kalyan");
        studentList.add("Kalyan"); // Duplicate data allowed
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true); // Different type data is allowed
        studentList.add(123);
        studentList.add(null); // Null is allowed

        System.out.println(studentList);


    }
}
