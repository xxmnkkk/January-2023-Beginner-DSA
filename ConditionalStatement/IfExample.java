package ConditionalStatement;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("You are eligible for a voter ID card");
        }
    }
}
