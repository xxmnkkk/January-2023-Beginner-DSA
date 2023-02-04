package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class OldestAndYoungest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();

        //Youngest
        if(age1 < age2 && age1 < age3) {
            System.out.println("1 ");
        }
        else if(age2 < age1 && age2 < age3) {
            System.out.println("2 ");
        }
        else {
            System.out.println("3 ");
        }

        //Oldest
        if(age1 > age2 && age1 > age3) {
            System.out.println("1 ");
        }
        else if(age2 > age1 && age2 > age3) {
            System.out.println("2 ");
        }
        else {
            System.out.println("3 ");
        }
    }
}
