package feb.ex_06032025_CollectionFramework_Part_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab99_List_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);
        marks.add(70);
        System.out.println(marks);

        // Sorting
        Collections.sort(marks);
        System.out.println(marks);

        // Reverse
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);


    }
}
