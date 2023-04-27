package Collection.Set.TreeSet;

import com.sun.source.tree.Tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(100);

        System.out.println(treeSet);
    }
}
