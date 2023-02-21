package Searching;

public class BinarySearchSolutionII {
    public static void main(String[] args) {
        int arr[] = {-11, 11, 31, 51, 71, 91, 101};
        int key = 11;

        int start = 0, end = arr.length - 1;

        while(end - start > 1) {
            int mid = start + (end - start) / 2;

            if(arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        if(arr[start] == key) {
            System.out.println("Found at index: " + start);
        }
        else if(arr[end] == key) {
            System.out.println("Found at index: " + end);
        }
        else {
            System.out.println("Not found");
        }
    }
}
