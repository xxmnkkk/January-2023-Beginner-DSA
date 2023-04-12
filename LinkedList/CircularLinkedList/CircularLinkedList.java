package LinkedList.CircularLinkedList;

public class CircularLinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void traverse() {
        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head);
        System.out.println();
    }

    private void push(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
            head.next = head;
            tail = node;
        }
        else {
            node.next = head;
            tail.next = node;
            head = node;
        }

        length++;
    }

    private void append(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
            tail = node;
            tail.next = tail;
        }
        else {
            node.next = head;
            tail.next = node;
            tail = node;
        }

        length++;
    }

    private void insertAtPosition(int data, int position) {
        if(position < 1 || position > (length + 1)) {
            System.out.println("Position " + position + " is invalid");
            System.out.println("Valid positions are: 1 to " + (length + 1));
        }
        else {
            if(position == 1) {
                push(data);
            }
            else if(position == (length + 1)) {
                append(data);
            }
            else {
                Node temp = head;
                int currentPosition = 1;

                while(currentPosition != (position - 1)) {
                    temp = temp.next;
                    currentPosition++;
                }

                Node node = new Node(data);
                node.next = temp.next;
                temp.next = node;

                length++;
            }
        }
    }

    private void deleteAtPosition(int position) {
        if(position < 1 || position > length) {
            System.out.println("Position " + position + " is invalid");
            System.out.println("Valid positions are: 1 to " + length);
        }
        else {
            if(position == 1) {
                Node delete = head;
                head = head.next;
                tail.next = head;
                delete.next = null;
            }
            else {
                Node temp = head;
                int currentPosition = 1;

                while(currentPosition != (position - 1)) {
                    temp = temp.next;
                    currentPosition++;
                }
                Node delete = temp.next;

                temp.next = delete.next;
                delete.next = null;

                if(position == length) {
                    tail = temp;
                }
            }

            length--;
        }
    }
    
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.push(1);
        circularLinkedList.traverse();

        circularLinkedList.push(2);
        circularLinkedList.traverse();

        circularLinkedList.push(3);
        circularLinkedList.traverse();

        circularLinkedList.push(4);
        circularLinkedList.traverse();

        circularLinkedList.append(5);
        circularLinkedList.traverse();

        circularLinkedList.append(6);
        circularLinkedList.traverse();

        circularLinkedList.append(7);
        circularLinkedList.traverse();

        circularLinkedList.insertAtPosition(8, 0);
        circularLinkedList.traverse();

        circularLinkedList.insertAtPosition(9, -1);
        circularLinkedList.traverse();

        circularLinkedList.insertAtPosition(10, 1);
        circularLinkedList.traverse();

        circularLinkedList.insertAtPosition(11, 9);
        circularLinkedList.traverse();

        circularLinkedList.insertAtPosition(12, 4);
        circularLinkedList.traverse();

        circularLinkedList.insertAtPosition(13, 2);
        circularLinkedList.traverse();

        circularLinkedList.deleteAtPosition(-1);
        circularLinkedList.traverse();

        circularLinkedList.deleteAtPosition(0);
        circularLinkedList.traverse();

        circularLinkedList.deleteAtPosition(circularLinkedList.length + 1);
        circularLinkedList.traverse();

        circularLinkedList.deleteAtPosition(1);
        circularLinkedList.traverse();

        circularLinkedList.deleteAtPosition(circularLinkedList.length);
        circularLinkedList.traverse();

        circularLinkedList.deleteAtPosition(3);
        circularLinkedList.traverse();

        circularLinkedList.deleteAtPosition(2);
        circularLinkedList.traverse();

        circularLinkedList.deleteAtPosition(6);
        circularLinkedList.traverse();
    }
}
