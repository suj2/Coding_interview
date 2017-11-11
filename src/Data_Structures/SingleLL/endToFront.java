package Data_Structures.SingleLL;

public class endToFront
{

    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int num)
        {
            data = num;
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
            n= n.next;
        }
        System.out.println();
    }
    void swap()
    {
        Node  current = head;
        while(current != null && current.next != null )
        {
            int k = current.data;
            current.data = current.next.data;
            current.next.data = k ;
            current = current.next.next;
        }
    }

    void sendToEnd()
    {
        Node a = head;
        while(a.next.next!= null)
        {
            a = a.next;

        }
        System.out.println(a.data);
        Node temp = a.next;
        a.next.next = head;
        head = temp;
        a.next = null;


    }

    public static void main(String args[])
    {
        endToFront e = new endToFront();
        e.push(33);
        e.push(12);
        e.push(11);
        e.push(56);
        e.push(34);
        e.push(43);
        e.printAll();
        e.sendToEnd();
        e.printAll();

    }
}
