package Data_Structures.SingleLL;

public class NthNode {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }}
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

        int printNth(int num)
    {
        Node first = head, second = head;
        int less = 0;
        while(first!=null && less < num)
        {
            first = first.next;
            less++;
        }

        while(first.next!=null)
        {
            first = first.next;
            second = second.next;
        }
        return second.data;

    }


    public static void main(String args[])
    {
        NthNode d = new NthNode();
        d.push(33);
        d.push(12);
        d.push(14) ;
        d.push(56);
        d.push(78);
        d.printAll();
        System.out.println("the num is " + d.printNth(1));


    }
}
