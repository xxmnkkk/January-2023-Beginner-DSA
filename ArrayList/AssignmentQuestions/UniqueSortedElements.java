package ArrayList.AssignmentQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueSortedElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            arrayList.add(input);
        }

        Collections.sort(arrayList);
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int element = arrayList.get(i);

            if(!result.contains(element)) {
                result.add(element);
            }
        }

        for(int i = 0; i < n; i++) {
            int element = result.get(i);
            System.out.print(element + " ");
        }
    }
}
