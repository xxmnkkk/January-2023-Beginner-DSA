package OOP.Abstraction.Interface;

interface D {
    void print();
}

interface E {
    void print(int a);
}
public class MultipleInheritanceWithSameMethodName implements D, E {
    public void print() {

    }

    public void print(int a) {

    }

    public static void main(String[] args) {

    }
}
