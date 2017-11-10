package DataStructure.LinkedList;

import javax.xml.soap.Node;

/**
 * Created by hemantkumar on 11/7/2017.
 */

// Traverse LinkedList with 3 nodes and print all elements
//    Methods to insert node at any position in LL

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
private void insertAfter(Node prev_Node, int data) {
    if (prev_Node == null) {
        System.out.println("Previous Node can't be empty");
        return;
    }
    Node new_node = new Node(data);
    new_node.next = prev_Node.next;
    prev_Node.next = new_node;

}


// method to add node at some node
    private void insertNodeAtEnd(int data)
    {
        Node new_node = new Node(data);
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = new_node;
    }


    private void delete(Node n)
    {

    }
    

//driver method
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
        object.insertNodeAtEnd(6);
        object.printlinkedlist();
        object.insertAfter(second,9);


    }
}
