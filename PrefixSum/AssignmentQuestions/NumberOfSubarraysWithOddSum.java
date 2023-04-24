package PrefixSum.AssignmentQuestions;

import java.util.Scanner;

public class NumberOfSubarraysWithOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        int evenSumCount = 0;
        int oddSumCount = 0;
        long sum = 0;
        long answer = 0L;
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            sum = sum + arr[i];
            if(sum % 2 == 1) {
                answer = answer + (evenSumCount + 1);
                oddSumCount++;
            }
            else {
                answer = answer + oddSumCount;
                evenSumCount++;
            }
        }

        System.out.println(answer);
    }
}
