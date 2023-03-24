package Sorting.AssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int i = 0, j = 2;
        long tripletCount = 0;

        while(j < n) {
            if(i == (j - 1)) {
                j++;
                continue;
            }

            if(arr[j] - arr[i] > p) {
                i++;
                continue;
            }

            int numberCount = j - i;
            int numberCountC2 = (numberCount * (numberCount - 1)) / 2;
            tripletCount = tripletCount + numberCountC2;

            j++;
        }

        System.out.println(tripletCount);
    }
}
