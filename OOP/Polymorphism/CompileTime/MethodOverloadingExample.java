package OOP.Polymorphism.CompileTime;

public class MethodOverloadingExample {
    private static void add() {
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;

        System.out.println("Sum (): " + sum);
    }

    private static void add(int num) {
        int num1 = 10;

        int sum = num1 + num;

        System.out.println("Sum (int num): " + sum);
    }

    private static void add(float num) {
        int num1 = 10;

        float sum = num1 + num;

        System.out.println("Sum (float num): " + sum);
    }

    /*
    The below function will give an error, as the number of arguments and the
    type of arguments matches with the function above.
    Overloading is not possible if we have the same number of arguments and the
    same type of arguments, but different return types.

    private static float add(float num) {
        int num1 = 10;

        float sum = num1 + num;

        return sum;
    }
     */

    //It is possible to overload the main() method
    public static void main() {
        System.out.println("In main() method with zero arguments");
    }

    public static void main(String[] args) {
        add(10.17f);

        main();
    }
}
