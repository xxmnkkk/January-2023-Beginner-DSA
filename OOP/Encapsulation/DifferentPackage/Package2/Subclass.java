package OOP.Encapsulation.DifferentPackage.Package2;

import OOP.Encapsulation.DifferentPackage.Package1.Class2;

public class Subclass extends Class2 {
    public static void main(String[] args) {
        Class2.publicMethod();
        //Class2.privateMethod(); -> error as this has private access in its parent class of a different package
        Class2.protectedMethod();
        //Class2.defaultMethod(); -> error as this has default access in its parent class of a different package
    }
}
