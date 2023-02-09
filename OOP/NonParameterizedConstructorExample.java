package OOP;

public class NonParameterizedConstructorExample {
    int i;
    float f;
    String s;

    /*
    Syntax:
    class-name() {

    }
     */
    NonParameterizedConstructorExample() {
        i = 12;
        f = 1.203f;
        s = "113";
    }

    public static void main(String[] args) {
        NonParameterizedConstructorExample nonParameterizedConstructorExample
                = new NonParameterizedConstructorExample();

        System.out.println(nonParameterizedConstructorExample.i);
        System.out.println(nonParameterizedConstructorExample.f);
        System.out.println(nonParameterizedConstructorExample.s);

        NonParameterizedConstructorExample nonParameterizedConstructorExample1
                = new NonParameterizedConstructorExample();

        System.out.println(nonParameterizedConstructorExample1.i);
        System.out.println(nonParameterizedConstructorExample1.f);
        System.out.println(nonParameterizedConstructorExample1.s);

    }
}
