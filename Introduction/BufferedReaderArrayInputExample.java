package Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderArrayInputExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];

        String input = bufferedReader.readLine();
        String strArr[] = input.split(" ");
    }
}
