package OOP.Encapsulation.SamePackage;

import OOP.Encapsulation.DifferentPackage.Package1.Class1;

class Class2 {
    public static void publicMethod() {
        System.out.println("public");
    }

    private static void privateMethod() {
        System.out.println("private");
    }

    protected static void protectedMethod() {
        System.out.println("protected");
    }

    static void defaultMethod() {
        System.out.println("default");
    }
}
public class Subclass extends Class2 {
    public static void main(String[] args) {
        publicMethod();
        //privateMethod(); -> error, as it is a private method in the parent class
        protectedMethod();
        defaultMethod();
    }
}
