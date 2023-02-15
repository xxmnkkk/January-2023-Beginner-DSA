package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class MinimumAbsoluteDifferenceInACircularArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 1; i <= T; i++) {
            int N = scanner.nextInt();
            int arr[] = new int[N];

            for(int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }

            int minimumAbsoluteDifference = Math.abs(arr[N - 1] - arr[0]);
            for(int k = 1; k < N; k++) {
                int difference = arr[k] - arr[k - 1];
                int absoluteDifference = Math.abs(difference);

                if(absoluteDifference < minimumAbsoluteDifference) {
                    minimumAbsoluteDifference = absoluteDifference;
                }
            }

            System.out.println(minimumAbsoluteDifference);
        }
    }
}
