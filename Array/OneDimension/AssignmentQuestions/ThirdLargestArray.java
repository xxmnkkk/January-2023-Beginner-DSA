package Array.OneDimension.AssignmentQuestions;

import java.util.Scanner;

public class ThirdLargestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest, secondLargest, thirdLargest;
        largest = secondLargest = thirdLargest = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if(arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
            else {

            }
        }

        System.out.println(thirdLargest);
    }
}
