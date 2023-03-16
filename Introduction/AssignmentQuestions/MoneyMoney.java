package Introduction.AssignmentQuestions;

import java.util.Scanner;

public class MoneyMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int giftCount = scanner.nextInt();
        double sum = 0;

        double factor = 1e8;

        for (int i = 0; i < giftCount; i++) {
            double amount = scanner.nextDouble();
            amount = Math.round(amount * factor) / factor;
            String currency = scanner.next();

            if (currency.equals("BTC")) {
                amount = 380000.0 * amount;
            }
            sum = sum + amount;
        }
        System.out.printf("%.8f", sum);
    }
}
