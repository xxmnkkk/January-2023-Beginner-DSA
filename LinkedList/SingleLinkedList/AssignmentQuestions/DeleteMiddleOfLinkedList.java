package LinkedList.SingleLinkedList.AssignmentQuestions;

public class DeleteMiddleOfLinkedList {
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    private static int findLength(Node head) {
        int length = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            length++;
        }

        return length;
    }

    private static void deleteAtPosition(Node head, int position) {
        Node temp = head;
        int currentPosition = 1;

        while(currentPosition != (position - 1)) {
            temp = temp.next;
            currentPosition++;
        }
        Node delete = temp.next;

        temp.next = delete.next;
        delete.next = null;
    }

    public static Node deleteMiddleElement(Node head) {
        int length = findLength(head);

        if(length == 1) {
            head.val = -1;
        }
        else {
            int position = length / 2 + 1;

            deleteAtPosition(head, position);
        }
        return head;
    }
}
