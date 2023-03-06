package DivideAndConquer;

public class XPowerY {
    private static int calculateXPowerY(int x, int y) {
        if(y == 0) {
            return 1;
        }

        int xPowerYBy2 = calculateXPowerY(x, y / 2);
        int result = xPowerYBy2 * xPowerYBy2;
        if(y % 2 == 1) {
            result = result * x;
        }

        return result;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        int result = calculateXPowerY(x, y);
        System.out.println(result);
    }
}
