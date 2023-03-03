package Recursion;

public class Factorial {
    private static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        int factorial = n * factorial(n - 1);

        return factorial;
    }

    public static void main(String[] args) {
        int number = 5;

        int factorial = factorial(number);

        System.out.println("Factorial: " + factorial);
    }
}
