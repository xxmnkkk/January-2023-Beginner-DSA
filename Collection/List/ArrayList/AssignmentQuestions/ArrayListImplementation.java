package Collection.List.ArrayList.AssignmentQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            arrayList.add(input);
        }

        for(int i = 0; i < n; i++) {
            int element = arrayList.get(i);
            System.out.print(element + " ");
        }
    }
}
