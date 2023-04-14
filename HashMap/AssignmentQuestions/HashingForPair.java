package HashMap.AssignmentQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class HashingForPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            int targetSum = scanner.nextInt();

            int arr[] = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            int result = 0;
            for(int j = 0; j < n; j++) {
                int num1 = arr[j];
                int num2 = targetSum - num1;

                if(frequencyMap.containsKey(num2)) {
                    result = 1;
                    break;
                }
                else {
                    frequencyMap.put(num1, 1);
                }
            }
            System.out.println(result);
        }
    }
}
