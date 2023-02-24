package Array.OneDimension.AssignmentQuestions;

import java.util.Scanner;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int minValueIndex = 0;
            int maxValueIndex = 0;

            //Find the index with the minimum element and the maximum element in the array
            for(int j = 1; j < n; j++) {
                if(arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }

                if(arr[j] > arr[maxValueIndex]) {
                    maxValueIndex = j;
                }
            }

            //Checking if the array was in increasing order or decreasing order
            int flag = 0;
            if(maxValueIndex == minValueIndex - 1) {
                flag = 1;
            }

            if(minValueIndex == maxValueIndex - 1) {
                flag = -1;
            }

            //increasing
            if(flag == 1) {
                //first half
                for(int j = 1; flag == 1 && j <= maxValueIndex; j++) {
                    if(arr[j] <= arr[j - 1]) {
                        flag = 0;
                    }
                }

                //second half
                for(int j = minValueIndex + 1; flag == 1 && j < n; j++) {
                    if(arr[j] <= arr[j - 1]) {
                        flag = 0;
                    }
                }
            }
            //decreasing
            else if(flag == -1) {
                //first half
                for(int j = 1; flag == -1 && j <= minValueIndex; j++) {
                    if(arr[j] >= arr[j - 1]) {
                        flag = 0;
                    }
                }

                //second half
                for(int j = maxValueIndex + 1; flag == -1 && j < n; j++) {
                    if(arr[j] >= arr[j - 1]) {
                        flag = 0;
                    }
                }
            }
            //neither
            else {

            }

            if(flag == 0) {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}
