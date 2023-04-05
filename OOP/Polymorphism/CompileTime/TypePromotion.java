package OOP.Polymorphism.CompileTime;

public class TypePromotion {
    private static void display() {
        System.out.println("In display() method");
    }

    private static void display(int num) {
        System.out.println("In display(int) method: " + num);
    }

    /*
    Hierarchy of data types:
    double
    float
    long
    int
    short
    byte
    char
     */
    private static void display(float num) {
        System.out.println("In display(float) method: " + num);
    }

    private static void display(int num1, long num2) {
        System.out.println("In display(int, long) method: " + num1 + " " + num2);
    }

    private static void display(long num1, int num2) {
        System.out.println("In display(long, int) method: " + num1 + " " + num2);
    }

    public static void main(String[] args) {
        long maxLongValue = Long.MAX_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        display(maxLongValue);

        /*
        The below function call will throw an error because there are two matching
        functions which can be invoked with the arguments being passed (because
        of type promotion):

        display(maxIntValue, maxIntValue);
         */
    }
}
