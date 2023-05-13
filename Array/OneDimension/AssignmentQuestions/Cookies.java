package Array.OneDimension.AssignmentQuestions;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int totalCookies = 0;
        for(int i = 0; i < n; i++) {
            int cookieCount = scanner.nextInt();
            totalCookies += cookieCount;

            if(totalCookies >= k) {
                break;
            }
        }

        int answer = totalCookies - k;

        System.out.println(answer);
    }
}
