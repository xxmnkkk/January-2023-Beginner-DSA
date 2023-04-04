package OOP.Polymorphism;

class Vehicle {
    void display() {
        System.out.println("In Vehicle class");
    }
}

class TwoWheeler extends Vehicle {
    void display() {
        System.out.println("In TwoWheeler class");
    }
}

class FourWheeler extends Vehicle {
    void display() {
        System.out.println("In FourWheeler class");
    }
}
public class DowncastingExample {
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        FourWheeler fourWheeler = new FourWheeler();

        Vehicle vehicle = new TwoWheeler();

        TwoWheeler twoWheelerRef;
        twoWheelerRef = (TwoWheeler) vehicle;
        twoWheelerRef.display();
    }
}
