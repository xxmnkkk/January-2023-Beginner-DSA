package Introduction;

//Step 1: Import `Scanner` class
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        //Step 2: Create an object of the `Scanner` class
        Scanner scanner = new Scanner(System.in);

        //Step 3: Taking input
        byte b = scanner.nextByte();
        short s = scanner.nextShort();
        int i = scanner.nextInt(); //50
        long l = scanner.nextLong();
        float f = scanner.nextFloat();
        double d = scanner.nextDouble();
        char c = scanner.next().charAt(0);
        boolean bool = scanner.nextBoolean();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);

        String strNextLine = scanner.nextLine();
        String strNext = scanner.next();

        System.out.println(strNextLine);
        System.out.println(strNext);
    }
}
