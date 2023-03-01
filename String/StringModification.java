package String;

public class StringModification {
    public static void main(String[] args) {
        String str = "Pneumonoultramicroscopicsilicavolcanoconiosis";
        int start = 5;
        int end = 20;

        String substring;
        substring = str.substring(start);
        System.out.println("Substring: " + substring);

        substring = str.substring(start, end);
        System.out.println("Substring: " + substring);
    }
}
