package LinkedList.SingleLinkedList.AssignmentQuestions;

public class ZerosAtFrontOfLinkedList {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static public Node moveZeroes(Node head) {
        Node temp = head;
        Node tempNext = temp.next;

        while(tempNext != null) {
            if(tempNext.data == 0) {
                temp.next = tempNext.next;
                tempNext.next = head;
                head = tempNext;
                tempNext = temp.next;
            }
            else {
                temp = tempNext;
                tempNext = tempNext.next;
            }
        }

        return head;
    }
}
