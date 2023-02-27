package String;

public class BasicFunctions {
    public static void main(String[] args) {
        String str1 = "Java";

        //length
        int length = str1.length();
        System.out.println("Length of " + str1 + ": " + length);

        //concatenation
        String str2 = "Code";
        //method 1
        String result;
        result = str1 + str2;
        System.out.println(str1 + " + " + str2 + " = " + result);

        //method 2
        result = str1.concat(str2);
        System.out.println(str1 + " + " + str2 + " = " + result);
    }
}
