package GeneralMaths.AssignmentQuestions;

import java.util.Scanner;

public class PrimeNumbersBeforeN {
    private static void calculatePrimeCount(int primeCount[]) {
        boolean composite[] = new boolean[100001];
        composite[0] = true;
        composite[1] = true;

        for(int p = 2; p * p <= 100000; p++) {
            if(!composite[p]) {
                for(int j = p * p; j <= 100000; j += p) {
                    composite[j] = true;
                }
            }
        }

        int count = 0;
        for(int i = 0; i <= 100000; i++) {
            if(!composite[i]) {
                count++;
            }
            primeCount[i] = count;
        }
    }

    public static void main(String[] args) {
        int primeCount[] = new int[100001];
        calculatePrimeCount(primeCount);

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i = 1; i <= t; i++) {
            int n = scanner.nextInt();

            System.out.println(primeCount[n]);
        }
    }
}
