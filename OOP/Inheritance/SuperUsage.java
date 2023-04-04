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
        System.out.println("Calling displayC() method using 'super' keyword");
        super.displayC();

        System.out.println("Initializing values of 'num1' and 'num2' using 'super' keyword");
        super.num1 = 1000;
        super.num2 = 2000;

        System.out.println("Calling displayC() method using 'super' keyword");
        super.displayC();

        System.out.println("Printing the value of 'num3' in displayD() method");
        System.out.println("num3: " + num3);
    }
}
public class SuperUsage {
    public static void main(String[] args) {
        D d = new D();

        System.out.println("Calling displayC() method using object of class 'D'");
        d.displayC();
        System.out.println("Calling displayD() method using object of class 'D'");
        d.displayD();
    }
}
