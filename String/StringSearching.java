package String;

public class StringSearching {
    public static void main(String[] args) {
        String str1 = "A quick brown fox jumps over the lazy dog";
        char ch = 'o';
        int firstOccurrence = str1.indexOf(ch);
        System.out.println("First occurrence of '" + ch + "' in '" + str1 + "': " + firstOccurrence);

        int lastOccurrence = str1.lastIndexOf(ch);
        System.out.println("Last occurrence of '" + ch + "' in '" + str1 + "': " + lastOccurrence);

        String str2 = "A quick brown fox jumps over the quick dog";
        String s = "quick";
        firstOccurrence = str2.indexOf(s);
        System.out.println("First occurrence of '" + s + "' in '" + str2 + "': " + firstOccurrence);

        lastOccurrence = str2.lastIndexOf(s);
        System.out.println("Last occurrence of '" + s + "' in '" + str2 + "': " + lastOccurrence);
    }
}
