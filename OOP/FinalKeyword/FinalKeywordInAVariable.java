package OOP.FinalKeyword;

public class FinalKeywordInAVariable {
    final static int staticVariable = 0;
    final int nonStaticVariable = 0;

    /*
    The below constructor is invalid, as the variable 'nonStaticVariable' is a 'final'
    variable:
    FinalKeywordInAVariable() {
        nonStaticVariable = 1000;
    }
     */

    public static void main(String[] args) {
        final int methodVariable;
        methodVariable = 10;

        /*
        The below statement is erroneous as the variable 'methodVariable' is a 'final'
        variable:
        methodVariable = 100;
         */

        /*
        The below statement is erroneous as the variable 'staticVariable' is a 'final'
        variable:
        staticVariable = 100;
         */

        /*
        The below statement is erroneous as the variable 'nonStaticVariable' is a 'final'
        variable:
        FinalKeywordInAVariable finalKeywordInAVariable
                = new FinalKeywordInAVariable();
        finalKeywordInAVariable.nonStaticVariable = 100;
         */
    }
}
