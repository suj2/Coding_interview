package Data_Structures.SingleLL;

public class ReverseLL {
    Node head ;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    void push(int num)
    {
        Node n = new Node(num);
        n.next= head;
        head = n;
    }


    void recursivePrint(Node n)
    {
       // Node n = head;
        if(n== null)
        {
            return;
        }
        recursivePrint(n.next);
        System.out.println(n.data);
    }
    public static void main(String args[])
    {
        ReverseLL d = new ReverseLL();
        d.push(22);
        d.push(33);
        d.push(44);
        d.push(34);
        d.push(99);
        d.recursivePrint(d.head);
    }
}
