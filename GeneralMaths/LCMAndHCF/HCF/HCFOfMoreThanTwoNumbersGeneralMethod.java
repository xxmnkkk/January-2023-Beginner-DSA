package GeneralMaths.LCMAndHCF.HCF;

public class HCFOfMoreThanTwoNumbersGeneralMethod {
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
        int numArray[] = {12, 8, 18};

        int hcf = numArray[0];
        for(int i = 1; i < numArray.length; i++) {
            if(hcf == numArray[i]) {
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

        System.out.println("HCF: " + hcf);
    }
}
