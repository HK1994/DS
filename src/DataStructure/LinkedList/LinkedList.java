package DataStructure.LinkedList;
/**
 * Created by hemantkumar on 11/7/2017.
 */

// Traverse LinkedList with 3 nodes and print all elements

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printLinkedList() {

        Node n = head;
        System.out.println("Linked List is ");
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list1.head.next = second;
        second.next = third;
        third.next = null;
        list1.printLinkedList();
    }
}
