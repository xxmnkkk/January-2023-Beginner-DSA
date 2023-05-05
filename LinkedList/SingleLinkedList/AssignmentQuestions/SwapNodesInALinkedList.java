package LinkedList.SingleLinkedList.AssignmentQuestions;

public class SwapNodesInALinkedList {
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node solve(Node head) {
        Node previous = head;
        Node current = previous.next;

        Node second = head.next;

        while(current.next != null) {
            previous = previous.next;
            current = current.next;
        }

        Node secondFromLast = previous;

        int temp = second.val;
        second.val = secondFromLast.val;
        secondFromLast.val = temp;

        return head;
    }
}
