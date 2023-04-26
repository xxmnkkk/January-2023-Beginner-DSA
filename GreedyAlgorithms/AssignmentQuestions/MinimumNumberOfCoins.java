package GreedyAlgorithms.AssignmentQuestions;

import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int denomination[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int t = scanner.nextInt();
        for(int i = 1; i <= t; i++) {
            int amount = scanner.nextInt();
            int coinCount = 0;

            for(int j = 0; j < denomination.length; j++) {
                if(amount < denomination[j]) {
                    continue;
                }
                if(amount == 0) {
                    break;
                }
                int coinsRequired = amount / denomination[j];
                coinCount += coinsRequired;

                amount = amount % denomination[j];
            }

            System.out.println(coinCount);
        }
    }
}
