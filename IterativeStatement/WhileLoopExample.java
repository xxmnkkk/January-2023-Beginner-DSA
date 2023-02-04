package IterativeStatement;

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0;

        while(i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("-----");

        i = 0;
        while(i < 10) {
            i++;
            System.out.println(i);
        }
    }
}
