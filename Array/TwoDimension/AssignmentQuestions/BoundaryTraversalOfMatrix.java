package Array.TwoDimension.AssignmentQuestions;

import java.util.Scanner;

public class BoundaryTraversalOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int arr[][] = new int[n][m];

            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    arr[j][k] = scanner.nextInt();
                }
            }

            int top = 0;
            int right = arr[0].length - 1;
            int bottom = arr.length - 1;
            int left = 0;

            for(int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;


            for(int j = top; j <= bottom; j++) {
                System.out.print(arr[j][right] + " ");
            }
            right--;


            if(n > 1) {
                for(int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }


            if(m > 1) {
                for(int j = bottom; j >= top; j--) {
                    System.out.print(arr[j][left] + " ");
                }
            }

            System.out.println();
        }
    }
}
