package GeneralMaths.LCMAndHCF.LCM;

public class LCMOfMoreThanTwoNumbers {
    private static int findLcm(int num1, int num2) {
        int num = num2;
        int multiple = 1;
        int lcm = num * multiple;


        while(true) {
            if(lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            multiple++;
            lcm = num * multiple;
        }

        return lcm;
    }

    public static void main(String[] args) {
        int numArray[] = {4, 14, 2, 8, 3};

        int lcm = numArray[0];
        for(int i = 1; i < numArray.length; i++) {
            if(lcm == numArray[i]) {
                lcm = numArray[i];
            }
            else {
                if(lcm > numArray[i]) {
                    int temp = lcm;
                    lcm = numArray[i];
                    numArray[i] = temp;
                }

                lcm = findLcm(lcm, numArray[i]);
            }
        }

        System.out.println("LCM: " + lcm);
    }
}
