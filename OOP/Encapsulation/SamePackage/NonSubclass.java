package OOP.Encapsulation.SamePackage;

class Class1 {
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

public class NonSubclass {
    public static void main(String[] args) {
        Class1.publicMethod();
        // Class1.privateMethod(); -> error, as it is a private method in a different class
        Class1.protectedMethod();
        Class1.defaultMethod();
    }
}
