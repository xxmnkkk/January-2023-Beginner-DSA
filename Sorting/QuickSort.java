package Sorting;

public class QuickSort {
    private static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return (i + 1);
    }

    private static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};

        System.out.println("Array before sorting: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array after sorting: ");
        printArray(arr);
    }
}
