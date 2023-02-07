package OOP;

public class InstanceVariableExample {
    //instance variables
    int num1;
    int num2;

    //class variable
    static int sum;

    public static void main(String[] args) {
        InstanceVariableExample instanceVariableExample
                = new InstanceVariableExample();

        instanceVariableExample.num1 = 10;
        instanceVariableExample.num2 = 20;
        System.out.println(instanceVariableExample.num1);
        System.out.println(instanceVariableExample.num2);

        sum = instanceVariableExample.num1 + instanceVariableExample.num2;
        System.out.println(sum);
    }
}
