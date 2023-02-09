package OOP;

public class ParameterizedConstructor {
    int i;
    float f;
    String s;

    ParameterizedConstructor(int a, float b, String c) {
        i = a;
        f = b;
        s = c;
    }

    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor
                = new ParameterizedConstructor(10, 109.123f, "Initial");

        System.out.println(parameterizedConstructor.i);
        System.out.println(parameterizedConstructor.f);
        System.out.println(parameterizedConstructor.s);

        ParameterizedConstructor parameterizedConstructor1
                = new ParameterizedConstructor(15, 198.123f, "Another Initial");

        System.out.println(parameterizedConstructor1.i);
        System.out.println(parameterizedConstructor1.f);
        System.out.println(parameterizedConstructor1.s);
    }
}
