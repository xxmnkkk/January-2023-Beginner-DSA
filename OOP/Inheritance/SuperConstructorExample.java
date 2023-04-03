package OOP.Inheritance;

class C {
    int num1;
    int num2;

    C() {
        num1 = 100;
        num2 = 200;
    }

    void displayC() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

class D extends C {
    int num3;

    D() {
        super();
        num3 = 30;
    }

    void displayD() {
        super.displayC();
        System.out.println("num3: " + num3);
    }
}
public class SuperConstructorExample {
    public static void main(String[] args) {
        D d = new D();

        d.displayC();
        d.displayD();
    }
}
