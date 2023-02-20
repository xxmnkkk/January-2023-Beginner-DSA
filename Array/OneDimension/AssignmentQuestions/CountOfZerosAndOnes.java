package Array.OneDimension.AssignmentQuestions;

import java.util.Scanner;

public class CountOfZerosAndOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            sum = sum + input;
        }

        System.out.println(sum + " " + (n - sum));
    }
}
