package LinkedList.SingleLinkedList.AssignmentQuestions;

import java.util.ArrayList;

public class ZerosAtFrontOfLinkedListUsingArray {
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

        Node temp = head;
        while(temp != null) {
            if(temp.data == 0) {
                linkedListArray.add(0, temp.data);
            }
            else {
                linkedListArray.add(temp.data);
            }

            temp = temp.next;
        }

        return linkedListArray;
    }

    static public Node moveZeroes(Node head) {
        ArrayList<Integer> linkedListArray = traverse(head);

        int index = 0;
        Node temp = head;
        while(temp != null) {
            temp.data = linkedListArray.get(index);

            temp = temp.next;
            index++;
        }

        return head;
    }
}
