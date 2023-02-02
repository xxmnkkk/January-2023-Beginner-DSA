package Introduction;

public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 35;

        int leftShift = num1 << 3;
        int rightShift = num2 >> 2;

        System.out.println(leftShift);
        System.out.println(rightShift);

        int and = num1 & num2;
        int or = num1 | num2;

        System.out.println(and);
        System.out.println(or);
    }
}
