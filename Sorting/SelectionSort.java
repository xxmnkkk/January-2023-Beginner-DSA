package Sorting;

public class SelectionSort {
    private static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void selectionSort(int arr[]) {
        int length = arr.length;
        for(int i = 0; i < (length - 1); i++) {
            int minIndex = i;

            for(int j = (i + 1); j < length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            //swap the value at 'i' with the value at 'minIndex'
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};

        System.out.println("Array before sorting: ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Array after sorting: ");
        printArray(arr);
    }
}
