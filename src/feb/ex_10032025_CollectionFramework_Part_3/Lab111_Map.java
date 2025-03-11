package feb.ex_10032025_CollectionFramework_Part_3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab111_Map {
    public static void main(String[] args) {
        // name:pramod, roll:31, phone:9876543210
         Map m1 = new HashMap();
        // Map m1 = new LinkedHashMap();
        // Map m1 = new TreeMap();

        m1.put("name","pramod");
        m1.put("rollNo","123");
        m1.put("phone","9876543211");
        System.out.println(m1);



    }
}
