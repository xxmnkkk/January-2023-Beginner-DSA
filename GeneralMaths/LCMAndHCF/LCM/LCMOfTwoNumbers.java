package GeneralMaths.LCMAndHCF.LCM;

public class LCMOfTwoNumbers {
    private static int findLcm(int num1, int num2) {
        int lcm = num2;


        while(true) {
            if(lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm += num2;
        }

        return lcm;
    }

    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 11;
        int lcm;

        if(num1 == num2) {
            lcm = num1;
        }
        else {
            if(num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            lcm = findLcm(num1, num2);
        }

        System.out.println("LCM: " + lcm);
    }
}
