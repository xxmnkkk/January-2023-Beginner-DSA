package Recursion.AssignmentQuestions;

public class PrintAllSubArrays {
    static void solvePrintSubArrays(int arr[], int length, int start, int end) {
        if(end == length) {
            start++;
            end = start;
        }

        if(start == length) {
            return;
        }

        for(int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        solvePrintSubArrays(arr, length, start, end + 1);
    }
    static void PrintSubarrays(int Arr[], int N){
        solvePrintSubArrays(Arr, N, 0, 0);
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 3};
        int n = arr.length;

        PrintSubarrays(arr, n);
    }
}
