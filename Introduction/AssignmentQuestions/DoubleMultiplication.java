package Introduction.AssignmentQuestions;

public class DoubleMultiplication {
    long solve(long a, double b) {
        b = b * 100 + 0.05;

        long result = (a * (long)b) / 100;

        return result;
    }
}
