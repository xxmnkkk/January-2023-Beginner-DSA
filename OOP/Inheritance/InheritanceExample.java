package OOP.Inheritance;

class A {
    int num1;
    int num2;

    void displayA() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

class B extends A {
    int num3;

    void displayB() {
        System.out.println("num3: " + num3);
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        B b = new B();

        b.num1 = 10;
        b.num2 = 20;
        b.num3 = 30;

        b.displayA();
        b.displayB();
    }
}
