package OOP.FinalKeyword;

class A {
    final void display() {
        System.out.println("In class A");
    }
}

class B extends A {
    /*
    The below method is erroneous, as the display() method in class A is
    final:
    void display() {
        System.out.println("In class B");
    }
     */
}
public class FinalKeywordInAMethod {
    public static void main(String[] args) {
        B b = new B();

        b.display();
    }
}
