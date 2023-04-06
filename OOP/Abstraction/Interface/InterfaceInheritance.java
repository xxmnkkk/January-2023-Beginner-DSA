package OOP.Abstraction.Interface;

interface F {
    void showF();
}

interface G extends F {
    void showG();
}
public class InterfaceInheritance implements G {
    public void showF() {
        System.out.println("In showF() of class InterfaceInheritance");
    }
    public void showG() {
        System.out.println("In showG() of class InterfaceInheritance");
    }

    public static void main(String[] args) {
        InterfaceInheritance interfaceInheritance = new InterfaceInheritance();

        interfaceInheritance.showF();
        interfaceInheritance.showG();
    }
}
