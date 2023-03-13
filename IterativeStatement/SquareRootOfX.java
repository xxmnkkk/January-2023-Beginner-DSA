package IterativeStatement;

public class SquareRootOfX {
    private static double calculateSquareRoot(int number, int precision) {
        int start = 0;
        int end = number;

        int mid;
        double result = 0.0;

        //integer part of square root
        while(start <= end) {
            mid = start + (end - start) / 2;

            if(mid * mid < number) {
                start = mid + 1;
                result = mid;
            }
            else if(mid * mid > number) {
                end = mid - 1;
            }
            else {
                result = mid;
                break;
            }
        }

        double incrementFactor = 0.1;
        for(int i = 0; i < precision; i++) {
            while(result * result <= number) {
                result = result + incrementFactor;
            }

            result = result - incrementFactor;
            incrementFactor = incrementFactor / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 11;
        int precision = 3;

        double result = calculateSquareRoot(number, precision);


    }
}
