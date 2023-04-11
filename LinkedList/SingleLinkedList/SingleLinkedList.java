package LinkedList.SingleLinkedList;

public class SingleLinkedList {
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
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //puts the node at the start of the linked list
    private void push(int data) {
        Node node = new Node(data);

        if(head == null) {
            tail = node;
        }
        else {
            node.next = head;
        }
        head = node;

        length++;
    }

    //puts the node at the end of the linked list
    private void append(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
        }
        else {
            tail.next = node;
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

                if(position == length) {
                    tail = temp;
                }
                else {
                    delete.next = null;
                }
            }

            length --;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.push(5);
        singleLinkedList.traverse();

        singleLinkedList.push(15);
        singleLinkedList.traverse();

        singleLinkedList.push(25);
        singleLinkedList.traverse();

        singleLinkedList.append(35);
        singleLinkedList.traverse();

        singleLinkedList.append(45);
        singleLinkedList.traverse();

        singleLinkedList.push(55);
        singleLinkedList.traverse();

        singleLinkedList.append(65);
        singleLinkedList.traverse();

        singleLinkedList.insertAtPosition(1000, 0);
        singleLinkedList.traverse();

        singleLinkedList.insertAtPosition(1000, -1);
        singleLinkedList.traverse();

        singleLinkedList.insertAtPosition(1000, singleLinkedList.length + 2);
        singleLinkedList.traverse();

        singleLinkedList.insertAtPosition(75, 1);
        singleLinkedList.traverse();

        singleLinkedList.insertAtPosition(85, singleLinkedList.length + 1);
        singleLinkedList.traverse();

        singleLinkedList.insertAtPosition(95, 7);
        singleLinkedList.traverse();

        singleLinkedList.deleteAtPosition(0);
        singleLinkedList.traverse();

        singleLinkedList.deleteAtPosition(singleLinkedList.length + 1);
        singleLinkedList.traverse();

        singleLinkedList.deleteAtPosition(1);
        singleLinkedList.traverse();

        singleLinkedList.deleteAtPosition(singleLinkedList.length);
        singleLinkedList.traverse();

        singleLinkedList.deleteAtPosition(6);
        singleLinkedList.traverse();

        singleLinkedList.append(105);
        singleLinkedList.traverse();

        singleLinkedList.deleteAtPosition(singleLinkedList.length);
        singleLinkedList.traverse();

        singleLinkedList.push(115);
        singleLinkedList.traverse();
    }
}
