package GeneralMaths.LCMAndHCF.HCF;

public class HCFOfTwoNumbersGeneralMethod {
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
        int num1 = 21;
        int num2 = 23;
        int hcf;

        if(num1 == num2) {
            hcf = num1;
        }
        else {
            if(num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            hcf = findHcf(num1, num2);
        }

        System.out.println("HCF: " + hcf);
    }
}
