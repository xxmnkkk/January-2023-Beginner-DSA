package Sorting.AssignmentQuestions;

import java.util.Scanner;

public class RankIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int length = str.length();
        int factorial = 1;
        for(int i = 1; i <= length; i++) {
            factorial = factorial * i;
        }

        int rank = 0;

        int count[] = new int[256];
        for(int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            count[ch] = count[ch] + 1;
        }

        int nonZeroCount = 0;
        for(int i = 0; i < 256; i++) {
            if(count[i] > 0) {
                nonZeroCount++;
                count[i] = nonZeroCount;
            }
        }
    }
}
