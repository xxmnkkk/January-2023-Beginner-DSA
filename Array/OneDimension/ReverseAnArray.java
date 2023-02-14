package Array.OneDimension;

public class ReverseAnArray {
    public static void main(String[] args) {
        int size = 8;
        int arr[] = new int[size];

        //generate random numbers between 5 and 50 (including 50)
        int start = 5;
        int end = 50;
        int sizeOfRange = end - start + 1;
        for(int i = 0; i < size; i++) {
            int randomNumber = (int)(Math.random() * sizeOfRange) + start;

            arr[i] = randomNumber;
        }

        System.out.println("Original array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < (size / 2); i++) {
            int j = size - 1 - i;

            //swap i-th element with j-th element
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            //swapping without using the third variable

        }

        System.out.println("Reversed array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
