package ConditionalStatement;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("You are eligible for a voter ID card");
        }
        else {
            System.out.println("You are not eligible for a voter ID card");
            System.out.println("Please try after " + (18 - age) + " years");
        }
    }
}
