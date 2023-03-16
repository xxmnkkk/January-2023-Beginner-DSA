package Sorting;

public class BubbleSort {
    private static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int arr[]) {
        int length = arr.length;
        for(int i = 1; i < length; i++) {
            for(int j = 0; j < (length - i); j++) {
                /*
                for ascending order: arr[j] > arr[j + 1]
                for descending order: arr[j] < arr[j + 1]
                 */
                if(arr[j] > arr[j + 1]) {
                    //swap the value at j-th index and (j + 1)th index
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};

        System.out.println("Array before sorting: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Array after sorting: ");
        printArray(arr);
    }
}
