package Collection.Map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        /*
        An 'Object' value will take value of any type - Integer, Float, String, etc.
         */

        //put a key-value pair
        hashMap.put("Alok", 94);
        hashMap.put("Richad", 91.5);
        hashMap.put("Moinuddin", "100");
        System.out.println("Map: " + hashMap);

        hashMap.put("Alok", 98);
        System.out.println("Map: " + hashMap);

        //get the value associated with a key
        Object alokMarks = hashMap.get("Alok");
        System.out.println("Alok's marks: " + alokMarks);

        //check if a key is present
        boolean isPresent;
        isPresent = hashMap.containsKey("Aman");
        System.out.println("Key: Aman, Present?: " + isPresent);

        isPresent = hashMap.containsKey("Alok");
        System.out.println("Key: Alok, Present?: " + isPresent);

        //check if hashmap is empty
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is empty?: " + isEmpty);

        //remove (key)
        //if key is present
        System.out.println("Removing key: Alok...");
        hashMap.remove("Alok");
        System.out.println(hashMap);

        //if key is not present
        System.out.println("Removing key: ABC...");
        hashMap.remove("ABC");
        System.out.println(hashMap);

        //remove (key, value)
        //if key-value combination is correct
        System.out.println("Removing key, value: Richad, 91.5...");
        hashMap.remove("Richad", 91.5);
        System.out.println(hashMap);

        //if key-value combination is incorrect
        System.out.println("Removing key, value: Moinuddin, 98...");
        hashMap.remove("Moinuddin", 98);
        System.out.println(hashMap);

        //clear the hashmap
        hashMap.clear();
        System.out.println(hashMap);

        isEmpty = hashMap.isEmpty();
        System.out.println("Is empty?: " + isEmpty);

        //replace a value associated with a key
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 4);
        hashMap.replace("A", 5);
        System.out.println(hashMap);

        //replace a value associated with a key and the value
        hashMap.replace("C", 2, 20);
        System.out.println(hashMap);

        hashMap.replace("C", 3, 20);
        System.out.println(hashMap);

        //size
        int size = hashMap.size();
        System.out.println("Size: " + size);

        //contains value
        boolean isValuePresent;
        isValuePresent = hashMap.containsValue(20);
        System.out.println("20 is present?: " + isValuePresent);

        isValuePresent = hashMap.containsValue(200);
        System.out.println("200 is present?: " + isValuePresent);

        //put if absent
        hashMap.putIfAbsent("A", 5);
        System.out.println(hashMap);

        hashMap.putIfAbsent("A", 6);
        System.out.println(hashMap);

        hashMap.putIfAbsent("E", 6);
        System.out.println(hashMap);

        //getOrDefault
        Object valueOfKey;
        valueOfKey = hashMap.getOrDefault("F", -1);
        System.out.println("Value: " + valueOfKey);

        valueOfKey = hashMap.getOrDefault("E", -1);
        System.out.println("Value: " + valueOfKey);

        //values
        Collection<Object> objectCollection = hashMap.values();
        System.out.println("Object collection: " + objectCollection);

        hashMap.put("F", 20);

        //keySet
        Set<String> keySet = hashMap.keySet();
        System.out.println("Key set: " + keySet);

        //entrySet
        Set<Map.Entry<String, Object>> entrySet = hashMap.entrySet();
        System.out.println("Entry set: " + entrySet);

        System.out.println("Each entry: ");
        for(Map.Entry<String, Object> eachEntry : entrySet) {
            String key = eachEntry.getKey();
            Object value = eachEntry.getValue();

            System.out.println(key + " : " + value);
        }
    }
}
