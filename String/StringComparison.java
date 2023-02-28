package String;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "JavaScript";
        String str3 = "JAVA";

        boolean result12 = str1.equals(str2);
        System.out.println(str1 + " == " + str2 + "?: " + result12);

        boolean result13 = str1.equals(str3);
        System.out.println(str1 + " == " + str3 + "?: " + result13);

        boolean result13IgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println(str1 + " == " + str3 + "?: " + result13IgnoreCase);

        boolean str1StartsWith = str1.startsWith("Age");
        System.out.println(str1 + " starts with 'Age'?: " + str1StartsWith);

        str1StartsWith = str1.startsWith("Ja");
        System.out.println(str1 + " starts with 'Ja'?: " + str1StartsWith);

        boolean str2StartsWith = str2.startsWith("Age");
        System.out.println(str2 + " starts with 'Age'?: " + str2StartsWith);

        str2StartsWith = str2.startsWith(str1);
        System.out.println(str2 + " starts with '" + str1 + "'?: " + str2StartsWith);

        str2StartsWith = str2.startsWith(str3);
        System.out.println(str2 + " starts with '" + str3 + "'?: " + str2StartsWith);

        str2StartsWith = str2.startsWith(str1, 1);
        System.out.println(str2 + " starts with '" + str1 + "' from index 1?: " + str2StartsWith);

        boolean str2EndsWith = str2.endsWith("Age");
        System.out.println(str2 + " ends with 'Age'?: " + str2EndsWith);

        str2EndsWith = str2.endsWith("ipt");
        System.out.println(str2 + " ends with 'ipt'?: " + str2EndsWith);

        int compare13 = str1.compareTo(str3);
        System.out.println(compare13);

        int compare12 = str1.compareTo(str2);
        System.out.println(compare12);
    }
}
