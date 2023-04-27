package Collection.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("E", 1);
        treeMap.put("A", 2);
        treeMap.put("Z", 3);
        treeMap.put("Q", 4);
        treeMap.put("D", 5);

        System.out.println(treeMap);

        String smallestKey = treeMap.firstKey();
        String largestKey = treeMap.lastKey();

        System.out.println("Smallest Key: " + smallestKey);
        System.out.println("Largest Key: " + largestKey);
    }
}
