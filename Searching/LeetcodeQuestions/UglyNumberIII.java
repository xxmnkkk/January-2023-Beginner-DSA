package Searching.LeetcodeQuestions;

public class UglyNumberIII {
    private int gcd(int num1, int num2) {
        if(num1 == 0) {
            return num2;
        }
        return gcd(num2 % num1, num1);
    }
    private int lcm(int num1, int num2) {
        return ((num1 * num2) / gcd(num1, num2));
    }
    private int divisorCount(int a, int b, int c, int num) {
        return ((num / a)
                + (num / b)
                + (num / c)
                - (num / lcm(a, b))
                - (num / lcm(b, c))
                - (num / lcm(a, c))
                + (num / lcm(a, lcm(b, c))));

    }
    public int nthUglyNumber(int n, int a, int b, int c) {
        int low = 1, high = Integer.MAX_VALUE;

        while(low < high) {
            int mid = low + (high -  low) / 2;

            if(divisorCount(a, b, c, mid) < n) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return low;
    }
}
