package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //creating an Collection.List.ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        //printing the data of an Collection.List.ArrayList
        System.out.println("Empty Result: " + arrayList);

        //storing data in an Collection.List.ArrayList
        //add(value) -> appends the element at the end of the list
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(-30);
        System.out.println("Collection.List.ArrayList after adding 3 elements: " + arrayList);

        //add(index, value) -> appends the element at the specified index of the list
        arrayList.add(0, 100);
        System.out.println("Collection.List.ArrayList after adding 4 elements: " + arrayList);

        //size of the Collection.List.ArrayList
        int size = arrayList.size();
        System.out.println("Size: " + size);

        arrayList.add(4, 400);
        System.out.println("Collection.List.ArrayList after adding 5 elements: " + arrayList);

        /*
        Index 6 will throw an error, as the Collection.List.ArrayList is of size 5,
        hence, the valid indices are: 0, 1, 2, 3, 4

        arrayList.add(6, 600);
        */

        //accessing an element at the i-th index
        int fourthIndexValue = arrayList.get(4);
        System.out.println("Element at 4th index: " + fourthIndexValue);

        //deleting an element at index 3
        arrayList.remove(3);
        System.out.println("Collection.List.ArrayList after removing element at 3rd index: " + arrayList);
        size = arrayList.size();
        System.out.println("Size: " + size);

        Integer remove = 400;
        arrayList.remove(remove);
        System.out.println("Collection.List.ArrayList after removing 400: " + arrayList);
        size = arrayList.size();
        System.out.println("Size: " + size);

        //Adding the elements of the arrayList to the newList
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.addAll(arrayList);
        System.out.println("arrayList: " + arrayList);
        System.out.println("newList: " + newList);
        newList.addAll(1, arrayList);
        System.out.println("newList: " + newList);

        //removeAll()
        newList.removeAll(arrayList);
        System.out.println("newList: " + newList);

        //clone
        ArrayList<Integer> clonedList = (ArrayList<Integer>)arrayList.clone();
        System.out.println("arrayList: " + arrayList);
        System.out.println("clonedList: " + clonedList);
        clonedList.add(1000);
        System.out.println("arrayList: " + arrayList);
        System.out.println("clonedList: " + clonedList);

        //contains()
        boolean isPresent = arrayList.contains(10);
        System.out.println("Is 10 present?: " + isPresent);
        isPresent = arrayList.contains(30);
        System.out.println("Is 30 present?: " + isPresent);

        //indexOf()
        int index = arrayList.indexOf(100);
        System.out.println("Index of 100: " + index);
        index = arrayList.indexOf(-30);
        System.out.println("Index of -30: " + index);

        //isEmpty()
        boolean empty = arrayList.isEmpty();
        System.out.println("Is empty?: " + empty);

        //set
        arrayList.set(1, -10);
        System.out.println("arrayList after replacing 10 with -10: " + arrayList);

        //toArray()
        Object arr[] = arrayList.toArray();
        System.out.print("arr: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //toArray(T[])
        Integer intArrayList[] = new Integer[arrayList.size()];
        arrayList.toArray(intArrayList);
        System.out.print("intArrayList: ");
        for(int i = 0; i < intArrayList.length; i++) {
            System.out.print(intArrayList[i] + " ");
        }
        System.out.println();

        //subList()
        arrayList.add(90);
        arrayList.add(80);
        arrayList.add(70);
        List<Integer> subList = arrayList.subList(2, 5);
        System.out.println("arrayList: " + arrayList);
        System.out.println("subList: " + subList);

        //frequency of an element in an arrayList
        arrayList.add(20);
        System.out.println("arrayList: " + arrayList);
        int frequency = Collections.frequency(arrayList, 20);
        System.out.println("Frequency of 20: " + frequency);

        //sort the arrayList in increasing order
        Collections.sort(arrayList);
        System.out.println("arrayList sorted in increasing order: " + arrayList);

        //sort the arrayList in decreasing order
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("arrayList sorted in decreasing order: " + arrayList);


        //deleting every element of the Collection.List.ArrayList
        arrayList.clear();
        System.out.println("Collection.List.ArrayList after clear(): " + arrayList);
        size = arrayList.size();
        System.out.println("Size: " + size);

        empty = arrayList.isEmpty();
        System.out.println("Is empty?: " + empty);
    }
}
