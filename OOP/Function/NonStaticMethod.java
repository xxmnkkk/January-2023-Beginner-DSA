package OOP.Function;

public class NonStaticMethod {
    private void print(String input) {
        System.out.println(input);
    }

    public static void main(String[] args) {
        NonStaticMethod nonStaticMethod = new NonStaticMethod();

        nonStaticMethod.print("Test");
    }
}
