package ConditionalStatement.AssignmentQuestions;

import java.util.Scanner;

public class SarasPhone {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();

        int q = M / K;
        int r = M % K;

        if(r > 0) {
            q++;
        }

        if (q > N) {
            q = -1;
        }

        System.out.println(q);
    }
}
