package HashMap;

import java.util.HashMap;

public class HashingExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Integer i;
        i = 1;
        hashMap.put("ABC", i);
        hashMap.put("DEF", 2);
        hashMap.put("GHI", 3);
        hashMap.put("JKL", 4);
        hashMap.put("MNO", 5);
        hashMap.put("PQR", 6);
        hashMap.put("STU", 7);
        hashMap.put("VWX", 8);
        hashMap.put("YZA", 9);
        hashMap.put("BCD", 10);
        hashMap.put("EFG", 11);
        hashMap.put("HIJ", 12);
        hashMap.put("KLM", 13);
        hashMap.put("NOP", 14);
        hashMap.put("QRS", 15);

        int value;
        value = hashMap.get("MNO");

        System.out.println(value);

        System.out.println(hashMap);
    }
}
