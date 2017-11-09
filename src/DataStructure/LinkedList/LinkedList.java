package DataStructure.LinkedList;

import javax.xml.soap.Node;

/**
 * Created by hemantkumar on 11/7/2017.
 */

// Traverse LinkedList with 3 nodes and print all elements

class LinkedList {
 Node head;

//    create Node
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

// print linkedList
    private void printlinkedlist() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("\n");
    }

// method to add node at the beginning O(1)
    private void insertNodeAtBegin(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

// method to add node at the end
    private void insertNodeAtEnd(Node prev_Node,int data)
    {

    }


// method to add node at some node
    private void insertAfter()
    {}
    


    public static void main(String[] args) {
        LinkedList object = new LinkedList();

        object.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        object.head.next = second;
        second.next = third;
        object.printlinkedlist();
        object.insertNodeAtBegin(5);
        object.printlinkedlist();
    }
}
