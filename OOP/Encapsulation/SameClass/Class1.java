package OOP.Encapsulation.SameClass;

public class Class1 {
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

    public static void main(String[] args) {
        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }
}
