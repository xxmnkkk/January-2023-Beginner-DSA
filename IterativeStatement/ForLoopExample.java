package IterativeStatement;

public class ForLoopExample {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-----");

        int j = 0;
        for(; j < 10; j++) {
            System.out.println(j);
        }

        System.out.println("-----");

        int k = 0;
        for(; k < 10; ) {
            System.out.println(k);
            k++;
        }

        System.out.println("-----");

        int l = 0;
        for(; ; ) {
            if(l < 10) {
                System.out.println(l);
                l++;
            }
            else {
                break;
            }
        }
    }
}
