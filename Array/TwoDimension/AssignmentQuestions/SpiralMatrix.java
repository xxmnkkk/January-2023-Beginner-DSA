package Array.TwoDimension.AssignmentQuestions;

import java.util.Scanner;

public class SpiralMatrix {
    private static boolean isValid(int top, int right, int bottom, int left) {
        boolean valid = (left <= right) && (top <= bottom);
        /*
        boolean valid = true;
        if(left > right || top > bottom) {
            valid = false;
        }
         */

        return valid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int top = 0;
        int right = arr[0].length - 1;
        int bottom = arr.length - 1;
        int left = 0;
        while(true) {
            for(int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            if(!isValid(top, right, bottom, left)) {
                break;
            }

            for(int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if(!isValid(top, right, bottom, left)) {
                break;
            }

            for(int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
            if(!isValid(top, right, bottom, left)) {
                break;
            }

            for(int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
            if(!isValid(top, right, bottom, left)) {
                break;
            }
        }
    }
}
