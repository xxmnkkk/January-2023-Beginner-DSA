package Array.OneDimension.AssignmentQuestions;

import java.util.Scanner;

public class EqualizeAAndB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count1 = 0, count2 = 0, sum1 = 0, sum2 = 0;

        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if(num == -1) {
                count1++;
            }
            else {
                sum1 += num;
            }
        }

        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if(num == -1) {
                count2++;
            }
            else {
                sum2 += num;
            }
        }

        String answer;
        if(count1 == 1 && count2 == 0) {
            if(sum1 <= sum2) {
                answer = "1";
            }
            else {
                answer = "0";
            }
        }
        else if(count1 == 0 && count2 == 1) {
            if(sum1 >= sum2) {
                answer = "1";
            }
            else {
                answer = "0";
            }
        }
        else if(count1 == 2 && count2 == 0) {
            if(sum1 <= sum2) {
                int result = Math.abs(sum1 - sum2) + 1;
                answer = result + "";
            }
            else {
                answer = "0";
            }
        }
        else if(count1 == 0 && count2 == 2) {
            if(sum1 >= sum2) {
                int result = Math.abs(sum1 - sum2) + 1;
                answer = result + "";
            }
            else {
                answer = "0";
            }
        }
        else {
            answer = "Infinite";
        }

        System.out.println(answer);
    }
}
