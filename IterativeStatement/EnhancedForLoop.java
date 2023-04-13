package IterativeStatement;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int arr[] = {4, 1, 7, 0, 10, 18, -13};

        //tradition for loop
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //enhanced for loop
        /*
        Syntax:
        for(data-type variable-name : iterable-object-name) {

        }
         */
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
