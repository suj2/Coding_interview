package Data_Structures.SingleLL;

public class SwapElements {

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

    public static void main(String args[])
    {
        SwapElements e = new SwapElements();
        e.push(33);
        e.push(12);
        e.push(11);
        e.push(56);
        e.push(34);
        e.push(43);
        e.printAll();
        e.swap();
       e.printAll();

    }
}
