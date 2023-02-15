package IterativeStatement;

public class MinimumElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {-5, -1, -2, -8, -9, -2, -10};

        int minimum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.println(minimum);
    }
}
