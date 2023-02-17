package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {31, 11, 91, 71, 51, 101, -11};
        int key = 101;

        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }

        if(index != -1) {
            System.out.println("Found at index: " + index);
        }
        else {
            System.out.println("Not found");
        }
    }
}
