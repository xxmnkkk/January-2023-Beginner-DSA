package Array.TwoDimension.AssignmentQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABooleanMatrixProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < t; i++) {
            String mAndN = bufferedReader.readLine();
            int m = Integer.parseInt(mAndN.split(" ")[0]);
            int n = Integer.parseInt(mAndN.split(" ")[1]);

            String ones = "";
            String zeros = "";

            for(int j = 0; j < n; j++) {
                ones = ones + "1 ";
                zeros = zeros + "0 ";
            }

            for(int k = 0; k < m; k++) {
                String row = bufferedReader.readLine();
                if(row.contains("1")) {
                    System.out.println(ones);
                }
                else {
                    System.out.println(zeros);
                }
            }
        }
    }
}
