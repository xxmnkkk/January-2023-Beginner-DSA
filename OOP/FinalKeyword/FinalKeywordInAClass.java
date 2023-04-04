package OOP.FinalKeyword;

final class C {
    void displayC() {
        System.out.println("In display C");
    }
}

/*
The below code is erroneous, as class C is a final class:
class D extends C {
    void displayD() {
        System.out.println("In display D");
    }
}
 */

public class FinalKeywordInAClass {
    public static void main(String[] args) {

    }
}
