package Data_Structures.SingleLL;

public class ReverseLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int a )
        {
            data = a;
            next = null;
        }


    }
    void push(int num)
    {
        Node n = new Node(num);
        n.next = head;
        head = n;
    }
    void printAll()
    {
        Node n = head;
        while(n!= null)
        {
            System.out.print(n.data + "  ");
            n = n.next;
        }
    }

    Node reverseList()
    {
        Node prev = null;
        Node current = head, next = null;
        while(current!= null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;


    }

    public static void main(String args[])
    {
        ReverseLinkedList l = new ReverseLinkedList();
        l.push(32);
        l.push(22);
        l.push(11);
        l.push(24);
        l.push(03);
        l.printAll();
        System.out.println();
         l.head  = l.reverseList();
         l.printAll();

    }
}
