package Introduction.AssignmentQuestions;

public class StringTypecast {
    static String checkConevrtion(int a) {
        // your code here

        //Method 1:
        //return (a + "");

        //Method 2:
        //return String.valueOf(a);

        //Method 3:
        return Integer.toString(a);
    }

    public static void main(String[] args) {
        checkConevrtion(12);
    }
}
