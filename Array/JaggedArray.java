package Array;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[][] = new int[4][];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Please enter the column size: ");
            int columnSize = scanner.nextInt();

            arr[i] = new int[columnSize];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Row " + (i + 1) + ": ");
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print("Column " + (j + 1) + ": ");
                arr[i][j] = scanner.nextInt();
            }

        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
