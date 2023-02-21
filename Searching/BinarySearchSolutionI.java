package Searching;

public class BinarySearchSolutionI {
    public static void main(String[] args) {
        int arr[] = {-11, 11, 31, 51, 71, 91, 101};
        int key = 76;

        int start = 0, end = arr.length - 1;
        int index = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] < key) {
                start = mid + 1;
            }
            else if (arr[mid] > key) {
                end = mid - 1;
            }
            else {
                index = mid;
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
