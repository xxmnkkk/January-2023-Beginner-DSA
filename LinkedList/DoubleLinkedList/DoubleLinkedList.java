package LinkedList.DoubleLinkedList;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        Node previous;
        int data;
        Node next;

        Node(int data) {
            this.previous = null;
            this.data = data;
            this.next = null;
        }
    }

    private void traverse() {
        Node temp;

        System.out.println("Forward traversal: ");
        temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        System.out.println("Backward traversal: ");
        temp = tail;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
        System.out.println();
    }

    private void push(int data) {
        Node node = new Node(data);

        if(head == null) {
            tail = node;
        }
        else {
            node.next = head;
            head.previous = node;
        }
        head = node;

        length++;
    }

    private void append(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
        }
        else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;

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
                node.previous = temp;
                node.next = temp.next;
                temp.next.previous = node;
                temp.next = node;

                length++;
            }
        }
    }

    private void deleteAtPosition(int position) {
        if (position < 1 || position > length) {
            System.out.println("Position " + position + " is invalid");
            System.out.println("Valid positions are: 1 to " + length);
        }
        else {
            Node delete;
            if(position == 1) {
                delete = head;
                head = delete.next;
                head.previous = null;
            }
            else {
                Node temp = head;
                int currentPosition = 1;

                while(currentPosition != (position - 1)) {
                    temp = temp.next;
                    currentPosition++;
                }

                delete = temp.next;

                temp.next = delete.next;

                if(position == length) {
                    tail = temp;
                }
                else {
                    delete.next.previous = temp;
                }
            }
            delete.previous = null;
            delete.next = null;

            length--;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.push(1);
        doubleLinkedList.traverse();

        doubleLinkedList.push(2);
        doubleLinkedList.traverse();

        doubleLinkedList.push(3);
        doubleLinkedList.traverse();

        doubleLinkedList.push(4);
        doubleLinkedList.traverse();

        doubleLinkedList.push(5);
        doubleLinkedList.traverse();

        doubleLinkedList.append(6);
        doubleLinkedList.traverse();

        doubleLinkedList.append(7);
        doubleLinkedList.traverse();

        doubleLinkedList.append(8);
        doubleLinkedList.traverse();

        doubleLinkedList.push(9);
        doubleLinkedList.traverse();

        doubleLinkedList.append(10);
        doubleLinkedList.traverse();

        doubleLinkedList.push(11);
        doubleLinkedList.traverse();

        doubleLinkedList.append(12);
        doubleLinkedList.traverse();

        doubleLinkedList.insertAtPosition(13, 0);
        doubleLinkedList.traverse();

        doubleLinkedList.insertAtPosition(14, -1);
        doubleLinkedList.traverse();

        doubleLinkedList.insertAtPosition(15, doubleLinkedList.length + 2);
        doubleLinkedList.traverse();

        doubleLinkedList.insertAtPosition(16, 1);
        doubleLinkedList.traverse();

        doubleLinkedList.insertAtPosition(17, doubleLinkedList.length + 1);
        doubleLinkedList.traverse();

        doubleLinkedList.insertAtPosition(18, 8);
        doubleLinkedList.traverse();

        doubleLinkedList.deleteAtPosition(0);
        doubleLinkedList.traverse();

        doubleLinkedList.deleteAtPosition(-1);
        doubleLinkedList.traverse();

        doubleLinkedList.deleteAtPosition(doubleLinkedList.length + 1);
        doubleLinkedList.traverse();

        doubleLinkedList.deleteAtPosition(1);
        doubleLinkedList.traverse();

        doubleLinkedList.deleteAtPosition(doubleLinkedList.length);
        doubleLinkedList.traverse();

        doubleLinkedList.deleteAtPosition(3);
        doubleLinkedList.traverse();

        doubleLinkedList.deleteAtPosition(7);
        doubleLinkedList.traverse();

        doubleLinkedList.deleteAtPosition(10);
        doubleLinkedList.traverse();
    }
}
