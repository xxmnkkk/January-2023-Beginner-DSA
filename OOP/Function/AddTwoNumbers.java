package OOP.Function;

public class AddTwoNumbers {
    /*
    Syntax:
    [access-specifier] [static] return-type function-name([parameter-list]) {
        //body

        [return value];
    }
     */

    //no parameter list and return type
    private static void addTwoNumbersIV() {
        int num1 = 15;
        int num2 = 10;

        int sum = num1 + num2;

        System.out.println(sum);
    }

    //no parameter list and return type
    private static int addTwoNumbersIII() {
        int num1 = 5;
        int num2 = 10;

        int sum = num1 + num2;

        return sum;
    }

    //parameter list and no return type
    private static void addTwoNumbersII(int num1, int num2) {
        int sum = num1 + num2;

        System.out.println(sum);
    }

    //parameter list and return type
    private static int addTwoNumbersI(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }


    public static void main(String[] args) {
        //calling the addTwoNumbers()
        int sumI = addTwoNumbersI(5, 6);
        System.out.println(sumI);

        addTwoNumbersII(5, 9);

        int sumIII = addTwoNumbersIII();
        System.out.println(sumIII);

        addTwoNumbersIV();
    }
}
