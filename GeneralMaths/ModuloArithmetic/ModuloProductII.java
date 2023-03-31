package GeneralMaths.ModuloArithmetic;

import java.util.ArrayList;

public class ModuloProductII {
    public long findProduct(ArrayList<Long> A) {
        long product = 1L;
        long maximumLimit = (long)1e18;
        for(int i = 0; i < A.size(); i++) {
            long element = A.get(i);
            long maximumElementAllowed = maximumLimit / product;

            if(element == 0) {
                return 0;
            }
            else if(element > maximumElementAllowed) {
                product = -1;
            }
            else {
                product = product * element;
            }
        }

        return product;
    }

    public static void main(String[] args) {

    }
}
