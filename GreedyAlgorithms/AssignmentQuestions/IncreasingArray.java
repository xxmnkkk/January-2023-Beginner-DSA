package GreedyAlgorithms.AssignmentQuestions;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        arr[0] = 1;
        for(int i = 1; i < n; i++) {
            int previousElement = arr[i - 1];
            int currentElement = arr[i];

            for(int j = previousElement + 1; j < currentElement; j++) {
                if(currentElement % j == 0) {
                    arr[i] = j;
                    break;
                }
            }
        }

        String output = "YES";
        for(int i = 1; i < n; i++) {
            if(arr[i] <= arr[i - 1]) {
                output = "NO";
                break;
            }
        }

        System.out.println(output);
    }
}
