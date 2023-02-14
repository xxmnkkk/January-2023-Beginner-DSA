package Array.OneDimension;

public class ArrayExample2 {
    public static void main(String[] args) {
        int size = 6;
        int arr[] = new int[size];

        //generate random numbers between 5 and 50 (including 50)
        int start = 5;
        int end = 50;
        int sizeOfRange = end - start + 1;
        for(int i = 0; i < size; i++) {
            int randomNumber = (int)(Math.random() * sizeOfRange) + start;

            arr[i] = randomNumber;
        }

        System.out.println("Values of the array are: ");
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
