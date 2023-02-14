package Array.OneDimension;

import java.util.Scanner;

/*
Question:
Write a program to take 'n' numbers as input from the user, store them in
an array, and find their sum.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        int sum = 0;
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

            sum = sum + arr[i];
        }

        System.out.println("Sum: " + sum);
    }
}
