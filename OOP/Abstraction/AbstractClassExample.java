package OOP.Abstraction;

abstract class F {
    int num1;
    F() {
        num1 = 10;
    }

    abstract void sum();
}

abstract class G extends F {
    int num2;

    G() {
        super();
        num2 = 20;
    }
}

class H extends G {
    void sum() {
        int sum = num1 + num2;

        System.out.println("Sum: " + sum);
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        H h = new H();

        h.sum();
    }
}
