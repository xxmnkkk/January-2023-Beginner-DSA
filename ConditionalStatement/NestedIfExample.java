package ConditionalStatement;

import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("Do you have a voter ID card? (y/n): ");
            char voterId = scanner.next().charAt(0);

            if(voterId == 'y' || voterId == 'Y') {
                System.out.println("You are eligible to vote");
            }
            else if(voterId == 'n' || voterId == 'N') {
                System.out.println("Please register for a voter ID");
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else {
            System.out.println("You are not eligible to vote");
            System.out.println("Please try after " + (18 - age) + " years, and please ensure you have a voter ID card");
        }
    }
}
