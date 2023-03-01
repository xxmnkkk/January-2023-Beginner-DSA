package String;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        String str = arr.toString();
        System.out.println(str);

        str = Arrays.toString(arr);
        System.out.println(str);
    }
}
