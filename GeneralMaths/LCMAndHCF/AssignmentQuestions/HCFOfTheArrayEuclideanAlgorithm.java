package GeneralMaths.LCMAndHCF.AssignmentQuestions;

import java.util.Scanner;

public class HCFOfTheArrayEuclideanAlgorithm {
    private static int findHcf(int num1, int num2) {
        while(num1 != 0) {
            int temp = num2;
            num2 = num1;
            num1 = temp % num1;
        }


        return num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numArray[] = new int[n];
        for(int i = 0; i < n; i++) {
            numArray[i] = scanner.nextInt();
        }

        int hcf = numArray[0];
        for(int i = 1; i < numArray.length; i++) {
            if(numArray[i] == 0) {
                continue;
            }
            else if(hcf == numArray[i]) {
                hcf = numArray[i];
            }
            else {
                if(hcf > numArray[i]) {
                    int temp = hcf;
                    hcf = numArray[i];
                    numArray[i] = temp;
                }

                hcf = findHcf(hcf, numArray[i]);
            }
        }

        System.out.println(hcf);
    }
}
