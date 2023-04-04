package OOP.Polymorphism;

class Shape {
    void area() {
        System.out.println("In area() of class Shape");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("In area() of class Square");
    }
}

class Rectangle extends Shape{
    void area() {
        System.out.println("In area() of class Rectangle");
    }
}
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        Shape shapeRef;

        shapeRef = shape;
        shapeRef.area();

        shapeRef = square;
        shapeRef.area();

        shapeRef = rectangle;
        shapeRef.area();
    }
}
