package OOP.Polymorphism;

class E {
    void display() {
        System.out.println("In class E");
    }
}

class F extends E {
    void display() {
        super.display();
        System.out.println("In class F");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        F f = new F();
        f.display();
    }
}
