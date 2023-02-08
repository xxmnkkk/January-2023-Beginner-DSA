package OOP.Function;

public class PassByValue {
    private static void print(String input) {
        System.out.println("1: " + input);

        input = "another input";

        System.out.println("2: " + input);
    }

    public static void main(String[] args) {
        String input;

        input = "10";
        print(input);

        System.out.println("3: " + input);
    }
}
