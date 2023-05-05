package Array.OneDimension;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    private static void findNextPermutation(int n, int arr[]) {
        for(int i = (n - 1); i > 0; i--) {
            for(int j = (i - 1); j >= 0; j--) {
                if(arr[i] > arr[j]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    Arrays.sort(arr, j + 1, n);

                    return;
                }
            }
        }

        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findNextPermutation(n, arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
