package SlidingWindow;

public class MaximumSumInGroupOfK {
    private static void getMaximumByBruteForce(int arr[], int n, int k) {
        int maximumSum = 0;
        int resultStart = -1;
        int resultEnd = -1;
        for(int start = 0; start <= (n - k); start++) {
            int end = start + (k - 1);
            int currentSum = 0;
            for(int i = start; i <= end; i++) {
                currentSum += arr[i];
            }

            System.out.println("Range: [" + start + ", " + end + "] -> " + currentSum);

            if(currentSum > maximumSum) {
                maximumSum = currentSum;
                resultStart = start;
                resultEnd = end;
            }
        }

        System.out.println();
        System.out.println("Output: ");
        System.out.print("Range: [" + resultStart + ", " + resultEnd + "] -> ");
        System.out.println(maximumSum);
    }

    private static void getMaximumBySlidingWindow(int arr[], int n, int k) {
        int maximumSum = 0;

        for(int i = 0; i < k; i++) {
            maximumSum += arr[i];
        }
        int resultStart = 0;
        int resultEnd = k;

        System.out.println("Range: [" + 0 + ", " + k + "] -> " + maximumSum);

        int currentSum = maximumSum;
        for(int start = 1; start <= (n - k); start++) {
            int end = start + (k - 1);

            currentSum = currentSum - arr[start - 1] + arr[end];

            System.out.println("Range: [" + start + ", " + end + "] -> " + currentSum);

            if(currentSum > maximumSum) {
                maximumSum = currentSum;
                resultStart = start;
                resultEnd = end;
            }
        }

        System.out.println();
        System.out.println("Output: ");
        System.out.print("Range: [" + resultStart + ", " + resultEnd + "] -> ");
        System.out.println(maximumSum);
    }

    public static void main(String[] args) {
        int n = 15;
        int arr[] = new int[n];

        int rangeStart = 5;
        int rangeEnd = 100;

        for(int i = 0; i < n; i++) {
            int randomNumber = (int)(Math.random() * (rangeEnd - rangeStart + 1) + rangeStart);
            arr[i] = randomNumber;
        }

        System.out.println("Input Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int k = 4;

        System.out.println("By brute force: ");
        getMaximumByBruteForce(arr, n, k);

        System.out.println();
        System.out.println();

        System.out.println("By sliding window: ");
        getMaximumBySlidingWindow(arr, n, k);
    }
}
