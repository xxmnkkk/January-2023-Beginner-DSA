package Sorting;

public class MergeSort {
    private static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void merge(int arr[], int low, int mid, int high) {
        int leftArraySize = mid - low + 1;
        int rightArraySize = high - mid;

        int leftArray[] = new int[leftArraySize];
        int rightArray[] = new int[rightArraySize];

        for(int i = 0; i < leftArraySize; i++) {
            leftArray[i] = arr[low + i];
        }

        for(int i = 0; i < rightArraySize; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;
        while(i < leftArraySize && j < rightArraySize) {
            if(leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];

                i++;
            }
            else {
                arr[k] = rightArray[j];

                j++;
            }
            k++;
        }

        while(i < leftArraySize) {
            arr[k] = leftArray[i];

            i++;
            k++;
        }

        while(j < rightArraySize) {
            arr[k] = rightArray[j];

            j++;
            k++;
        }
    }

    private static void split(int arr[], int low, int high) {
        if(low < high) {
            int mid = low + (high - low) / 2; //(low + high) / 2
            split(arr, low, mid);
            split(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void mergeSort(int arr[], int low, int high) {
        split(arr, low, high);
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};

        System.out.println("Array before sorting: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Array after sorting: ");
        printArray(arr);
    }
}
