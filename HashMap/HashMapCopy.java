package HashMap;

import java.util.HashMap;

public class HashMapCopy {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("Alok", 94);
        hashMap.put("Richad", 91.5);
        hashMap.put("Moinuddin", "100");

        HashMap<String, Object> hashMapShallowCopy = (HashMap<String, Object>) hashMap.clone();
        hashMapShallowCopy.put("Dheerendra", 93);

        System.out.println("Original: " + hashMap);
        System.out.println("Shallow copy: " + hashMapShallowCopy);
    }
}
