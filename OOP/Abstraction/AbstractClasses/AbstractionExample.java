package OOP.Abstraction.AbstractClasses;

abstract class A {
    abstract void fA();

    void nonAbstractA() {

    }
}

/*
The below non-abstract class is inheriting an abstract class.
Hence, it is mandatory to define the abstract method of the parent class.
 */
class B extends A {
    void fA() {
        System.out.println("Function fA() in class B");
    }
}

/*
The below abstract class is inheriting another abstract class.
Hence, it is not mandatory to define the abstract method of the parent class.
 */
abstract class C extends A {
    abstract void fC();
}

class D extends C {
    void fA() {
        System.out.println("Function fA() in class D");
    }

    void fC() {
        System.out.println("Function fC() in class D");
    }

    void fD() {
        System.out.println("Function fD() in class D");
    }
}

class E extends C {
    void fA() {
        System.out.println("Function fA() in class E");
    }

    void fC() {
        System.out.println("Function fC() in class E");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        D d = new D();
        E e = new E();

        C c;
        c = d;
        c.fC();

        c = e;
        c.fC();
    }
}
