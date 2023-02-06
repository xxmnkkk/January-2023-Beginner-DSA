package IterativeStatement.AssignmentQuestions;

public class IceCream {
    public static void main(String[] args) {
        int N = 5;
        int D = 3;

        for(int i = 1; i <= D; i++) {
            N = N - (N / 2);
            N = N * 3;
        }

        System.out.println(N);
    }
}
