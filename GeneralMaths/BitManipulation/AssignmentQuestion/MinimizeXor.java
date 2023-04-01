package GeneralMaths.BitManipulation.AssignmentQuestion;

import java.util.Scanner;

public class MinimizeXor {
    private static int findMinXor(int arr[], int n) {
        int minXor = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = (i + 1); j < n; j++) {
                int currentXor = arr[i] ^ arr[j];
                if(currentXor < minXor) {
                    minXor = currentXor;
                }
                if(minXor == 0) {
                    return minXor;
                }
            }
        }

        return minXor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minXor = findMinXor(arr, n);

        System.out.println(minXor);
    }
}
