package OOP.Function;

public class NonStaticFunctionExample {
    private void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        NonStaticFunctionExample nonStaticFunctionExample
                = new NonStaticFunctionExample();

        nonStaticFunctionExample.print("Test");
    }
}
