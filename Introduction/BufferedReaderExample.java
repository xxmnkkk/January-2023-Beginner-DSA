package Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        int intInput = Integer.parseInt(input);

        System.out.println(input + 500);
        System.out.println(intInput + 500);
    }
}
