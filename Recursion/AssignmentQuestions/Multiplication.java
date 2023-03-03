package Recursion.AssignmentQuestions;

public class Multiplication {
    static int Multiply(int M, int N) {
        if(M == 0 || N == 0) {
            return 0;
        }
        int result = M + Multiply(M, N - 1);

        return result;
    }

    public static void main(String[] args) {
        int result = Multiply(2, 3);
    }
}
