package GeneralMaths.LCMAndHCF.AssignmentQuestions;

import java.util.Scanner;

public class HCFOfTheArrayGeneralMethod {
    private static int findHcf(int num1, int num2) {
        int hcf = num1;
        int num = 1;
        for(int i = num1; i >= 1; num++, i = num1 / num) {
            if(num1 % i == 0 && num2 % i == 0) {
                hcf = i;
                break;
            }
        }

        return hcf;
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
