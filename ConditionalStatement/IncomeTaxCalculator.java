package ConditionalStatement;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your annual income: ");
        int income = scanner.nextInt();
        int tax = 0;

        if(income > 0 && income < 300000) {

        }
        else if(income < 600000) {
            tax = (5 * (income - 300000)) / 100;
        }
        else if(income < 900000) {
            tax = ((5 * 300000) / 100)
                    + ((10 * (income - 600000) / 100));
        }
        else if(income < 1200000) {
            tax = ((5 * 300000) / 100)
                    + ((10 * (300000) / 100))
                    + ((15 * (income - 900000)) / 100);
        }
        else if(income < 1500000) {
            tax = ((5 * 300000) / 100)
                    + ((10 * 300000 / 100))
                    + ((15 * 300000) / 100)
                    + ((20 * (income - 1200000)) / 100);
        }
        else {
            tax = ((5 * 300000) / 100)
                    + ((10 * 300000 / 100))
                    + ((15 * 300000) / 100)
                    + ((20 * 300000) / 100)
                    + (30 * (income - 1500000)) / 100;
        }

        System.out.println("Tax: " + tax);
    }
}
