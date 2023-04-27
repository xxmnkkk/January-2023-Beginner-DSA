package Collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("E", 1);
        linkedHashMap.put("A", 2);
        linkedHashMap.put("Z", 3);
        linkedHashMap.put("Q", 4);
        linkedHashMap.put("D", 5);

        System.out.println(linkedHashMap);
    }
}
