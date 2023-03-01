package String;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);

        stringBuilder.append("Java ");
        System.out.println(stringBuilder);

        stringBuilder.append("language");
        System.out.println(stringBuilder);

        stringBuilder.insert(5, "is ");
        System.out.println(stringBuilder);

        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);

        reverse.delete(3, 9);
        System.out.println(reverse);

        reverse.deleteCharAt(4);
        System.out.println(reverse);

        String s = reverse.toString();
        System.out.println(s);
    }
}
