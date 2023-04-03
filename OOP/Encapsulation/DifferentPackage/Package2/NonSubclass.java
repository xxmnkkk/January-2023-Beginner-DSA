package OOP.Encapsulation.DifferentPackage.Package2;

import OOP.Encapsulation.DifferentPackage.Package1.Class1;
public class NonSubclass {
    public static void main(String[] args) {
        Class1.publicMethod();

        /*
        error, as these are private, protected, and public methods respectively
        in a different class of a different package
        Class1.privateMethod();
        Class1.protectedMethod();
        Class1.defaultMethod();
         */
    }
}