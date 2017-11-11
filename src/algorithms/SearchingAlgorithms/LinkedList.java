package algorithms.SearchingAlgorithms;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }


    }

    public void printList()
    {
        Node n = head;
        while (n!= null)
        {
            System.out.print(n.data+" ");
            n = n.next;

        }


}
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.head = new Node(2);
        Node second = new Node(33);
        Node third = new Node (32);
        ll.head.next = second;
        second.next = third;
        ll.printList();
    }



}
