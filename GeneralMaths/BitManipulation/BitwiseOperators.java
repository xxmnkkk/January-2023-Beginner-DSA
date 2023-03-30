package GeneralMaths.BitManipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        int num1 = 49;
        int num2 = 53;

        int and = num1 & num2;
        int or = num1 | num2;
        int xor = num1 ^ num2;
        int leftShiftNum1By1 = num1 << 1;
        int leftShiftNum2By3 = num2 << 3;
        int rightShiftNum2By2 = num2 >> 2;
        int rightShiftNum1By4 = num1 >> 4;

        System.out.println(num1 + " & " + num2 + " = " + and);
        System.out.println(num1 + " | " + num2 + " = " + or);
        System.out.println(num1 + " ^ " + num2 + " = " + xor);
        System.out.println(num1 + " << 1 = " + leftShiftNum1By1);
        System.out.println(num2 + " << 3 = " + leftShiftNum2By3);
        System.out.println(num2 + " >> 2 = " + rightShiftNum2By2);
        System.out.println(num1 + " >> 4 = " + rightShiftNum1By4);
    }
}
