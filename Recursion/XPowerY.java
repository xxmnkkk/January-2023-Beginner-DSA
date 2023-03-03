package Recursion;

public class XPowerY {
    private static int power(int x, int y) {
        if(y == 0) {
            return 1;
        }
        int xPowerY = x * power(x, y - 1);
        return xPowerY;
    }
    public static void main(String[] args) {
        int x = 8;
        int y = -4;

        int result;
        float answer;
        if(y < 0) {
            result = power(x, -y);
            answer = 1.0f / result;
        }
        else {
            result = power(x, y);
            answer = result;
        }

        System.out.println(answer);
    }
}
