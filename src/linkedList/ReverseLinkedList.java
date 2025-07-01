package linkedList;

public class ReverseLinkedList {
    public Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node curr = head;
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public Node reverseList() {

        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr  = nextNode;
        }

        return  prev;

    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();  // Expected output: 1->2->3->4->5->null list.reverseList();
        list.head = list.reverseList();
        list.printList();
    }
}
