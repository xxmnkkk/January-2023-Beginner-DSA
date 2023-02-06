package IterativeStatement;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 2;

        int t1 = 0;
        int t2 = 1;

        System.out.println(t1);
        System.out.println(t2);

        for(int i = 3; i <= n; i++) {
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;

            System.out.println(t3);
        }
    }
}
