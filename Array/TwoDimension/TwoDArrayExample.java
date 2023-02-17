package Array.TwoDimension;

import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = 2;
        int numberOfColumns = 3;

        int array[][] = new int[numberOfRows][numberOfColumns];

        for(int i = 0; i < numberOfRows; i++) {
            for(int j = 0; j < numberOfColumns; j++) {
                System.out.print("Row: " + (i + 1) + " " + "Column: " + (j + 1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < numberOfRows; i++) {
            for(int j = 0; j < numberOfColumns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
