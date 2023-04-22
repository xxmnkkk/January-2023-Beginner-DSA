package KadanesAlgorithm;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];

        int rangeStart = -100;
        int rangeEnd = -50;

        for(int i = 0; i < n; i++) {
            int randomNumber = (int)(Math.random() * (rangeEnd - rangeStart + 1) + rangeStart);
            arr[i] = randomNumber;
        }

        System.out.println("Input Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < n; i++) {
            currentSum = currentSum + arr[i];
            maximumSum = Math.max(currentSum, maximumSum);

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maximumSum);
    }
}
