package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);

        System.out.println(map.get(1));
        System.out.println(map.get(6));
        System.out.println(map.getOrDefault(6, -1));
        System.out.println(map.getOrDefault(3, -1));
        System.out.println(map);
    }
}
