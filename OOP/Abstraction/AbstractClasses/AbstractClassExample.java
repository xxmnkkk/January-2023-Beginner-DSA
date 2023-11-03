package OOP.Abstraction.AbstractClasses;

abstract class F {
    int num2;
    F() {
        num2 = 10;
    }

    abstract void sum();
}

abstract class G extends F {
    int num3;

    G() {
        super();
        num3 = 20;
    }
}

class H extends G {
    void sum() {
        int sum = num2 + num3;

        System.out.println("Sum: " + sum);
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        H h = new H();

        h.sum();
    }
}
