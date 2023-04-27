package Collection.Map.HashMap.AssignmentQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 1; i <= t; i++) {
            if(i % 10 == 0) {
                System.gc();
            }

            int n = scanner.nextInt();
            int targetSum = scanner.nextInt();

            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            HashMap<Integer, Integer> sumMap = new HashMap<>();
            int maxSubarraySize = 0;
            int sum = 0;

            for(int j = 0; j < n; j++) {
                sum = sum + arr[j];

                if(sum == targetSum) {
                    maxSubarraySize = j + 1;
                }

                if(!sumMap.containsKey(sum)) {
                    sumMap.put(sum, j);
                }


                if(sumMap.containsKey(sum - targetSum)) {
                    if((j - sumMap.get(sum - targetSum)) > maxSubarraySize) {
                        maxSubarraySize = j - sumMap.get(sum - targetSum);
                    }
                }
            }

            System.out.println(maxSubarraySize);
        }
    }
}
