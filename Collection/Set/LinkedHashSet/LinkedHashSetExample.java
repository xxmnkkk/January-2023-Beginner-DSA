package Collection.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();

        linkedHashSet.add(10);
        linkedHashSet.add(50);
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        linkedHashSet.add(10);
        linkedHashSet.add(100);

        for(Integer i : linkedHashSet) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
