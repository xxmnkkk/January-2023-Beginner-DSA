package HashMap;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        /*
        An 'Object' value will take value of any type - Integer, Float, String, etc.
         */

        //put
        hashMap.put("Alok", 94);
        hashMap.put("Richad", 91.5);
        hashMap.put("Moinuddin", "100");
        System.out.println("Map: " + hashMap);

        hashMap.put("Alok", 98);
        System.out.println("Map: " + hashMap);

        //get
        Object alokMarks = hashMap.get("Alok");
        System.out.println("Alok's marks: " + alokMarks);
    }
}
