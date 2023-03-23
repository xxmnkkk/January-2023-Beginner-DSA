package Sorting.AssignmentQuestions;

import java.util.Scanner;

public class GetTheShadowUsingVisited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            for(int j = 0; j < n; j++) {
                int absoluteValue = Math.abs(arr[j]);

                if(arr[absoluteValue - 1] > 0) {
                    arr[absoluteValue - 1] = -arr[absoluteValue - 1];
                }
                else {
                    System.out.print(absoluteValue + " ");
                }
            }

            for(int j = 0; j < n; j++) {
                if(arr[j] > 0) {
                    System.out.print(j + 1);
                    break;
                }
            }

            System.out.println();
        }
    }
}
