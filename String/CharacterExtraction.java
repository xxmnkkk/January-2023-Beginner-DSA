package String;

public class CharacterExtraction {
    public static void main(String[] args) {
        String str = "A quick brown fox jumps over the lazy dog";
        int length = str.length();

        //character from a given index
        char ch;
        //valid index
        ch = str.charAt(10);
        System.out.println("Character at 10th index: " + ch);
        /*
        invalid index will give an error

        ch = str.charAt(100);
        System.out.println("Character at 100th index: " + ch);
         */

        int sourceStart = 10;
        int sourceEnd = 20;
        char target[] = new char[2 * length];
        int targetStart = 3;

        str.getChars(sourceStart, sourceEnd, target, targetStart);
        String targetString = new String(target);
        System.out.println("Target String: " + targetString);
    }
}
