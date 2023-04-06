package OOP.Abstraction.Interface;

interface H {
    void showH();

    default void print() {
        System.out.println("In print() of interface H");
    }
}
public class InterfaceWithDefaultMethod implements H {
    public void showH() {
        System.out.println("In showH() of class InterfaceWithDefaultMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefaultMethod interfaceWithDefaultMethod
                = new InterfaceWithDefaultMethod();

        interfaceWithDefaultMethod.showH();

        interfaceWithDefaultMethod.print();
    }
}
