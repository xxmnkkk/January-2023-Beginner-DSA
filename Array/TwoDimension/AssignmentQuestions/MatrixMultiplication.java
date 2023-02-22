package Array.TwoDimension.AssignmentQuestions;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int arr1[][] = new int[m][n];
        int arr2[][] = new int[n][p];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < p; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        int result[][] = new int[m][p];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < p; j++) {
                for(int k = 0; k < n; k++) {
                    result[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
