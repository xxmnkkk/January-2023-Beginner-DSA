package PrefixSum.AssignmentQuestions;

import java.util.Scanner;

public class SumOfOddLengthSubarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long prefixSum[] = new long[n];
        long sum = 0;
        for(int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            sum = sum + element;

            prefixSum[i] = sum;
        }

        long sumOfPowers = 0;
        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end += 2) {
                long power;
                if(start == 0) {
                    power = prefixSum[end];
                }
                else {
                    power = prefixSum[end] - prefixSum[start - 1];
                }
                sumOfPowers += power;
            }
        }

        System.out.println(sumOfPowers);
    }
}
