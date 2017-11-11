package Data_Structures.SingleLL;

public class NNodeLL {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    void push(int num)
    {
        Node n = new Node(num);
        n.next = head;
        head = n;

    }
    int count(int num)
    {
        Node n = head;
        int c = 0;
        while(c< num)
        {
            n =n.next;
            c++;
        }

       // System.out.println("data is " + n.data);
        return n.data;

    }



    public static void main(String args[])
    {
        NNodeLL ll = new NNodeLL();
        ll.push(32);
        ll.push(31);
        ll.push(78);
        ll.push(58);
        ll.push(19);
        ll.push(53);
        System.out.println("Position 2 contains  " +ll.count(3));

    }
}
