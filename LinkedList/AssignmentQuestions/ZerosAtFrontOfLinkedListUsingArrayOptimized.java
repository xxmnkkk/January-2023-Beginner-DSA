package LinkedList.AssignmentQuestions;

import java.util.ArrayList;

public class ZerosAtFrontOfLinkedListUsingArrayOptimized {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    private static ArrayList<Integer> traverse(Node head) {
        ArrayList<Integer> linkedListArray = new ArrayList<>();
        int zeroCount = 0;
        Node temp = head;
        while(temp != null) {
            if(temp.data == 0) {
                zeroCount++;
            }
            else {
                linkedListArray.add(temp.data);
            }

            temp = temp.next;
        }

        linkedListArray.add(zeroCount);

        return linkedListArray;
    }

    static public Node moveZeroes(Node head) {
        ArrayList<Integer> linkedListArray = traverse(head);

        int linkedListArraySize = linkedListArray.size();
        int zeroCount = linkedListArray.get(linkedListArraySize - 1);

        int index = 0;
        Node temp = head;
        while(temp != null) {
            if(index < zeroCount) {
                temp.data = 0;
            }
            else {
                temp.data = linkedListArray.get(index - zeroCount);
            }

            index++;
            temp = temp.next;
        }

        return head;
    }
}
