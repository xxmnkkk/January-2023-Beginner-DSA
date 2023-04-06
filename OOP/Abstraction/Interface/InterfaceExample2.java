package OOP.Abstraction.Interface;

interface A {
    int num = 10;
    void print();
}
public class InterfaceExample2 implements A {
    public void print() {
        System.out.println("In print() inside class InterfaceExample2");
    }

    public static void main(String[] args) {
        InterfaceExample2 interfaceExample2
                = new InterfaceExample2();

        interfaceExample2.print();
    }
}
