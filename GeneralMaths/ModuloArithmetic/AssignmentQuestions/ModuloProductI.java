package GeneralMaths.ModuloArithmetic.AssignmentQuestions;

import java.util.ArrayList;

public class ModuloProductI {
    public long findProduct(ArrayList<Long> A) {
        long product = 1L;
        long limit = (long)1e18;
        for(int i = 0; i < A.size(); i++) {
            long element = A.get(i);

            if(element == 0) {
                return 0;
            }
            product = product * element;
            if(product > limit || product <= 0) {
                return -1;
            }
        }

        return product;
    }

    public static void main(String[] args) {

    }
}
