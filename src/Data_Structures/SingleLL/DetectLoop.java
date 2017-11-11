package Data_Structures.SingleLL;

import java.util.HashSet;

public class DetectLoop {
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

    void PrintAll()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data+ " ");
        }
    }

    boolean detectUsingHash()
    {
        Node n = head;
        HashSet<Node> e = new HashSet<Node>();
        while(n!= null)
        {
            if(e.contains(n))
                return true;
            e.add(n);
            n = n.next;
        }
        return false;

    }
    int detectLoop()
    {
        Node slow = head, fast = head;
        if(fast == null || slow == null)
            return  -1;
        while(fast.next !=null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
            {

                System.out.println("Loop detected");
                return 0;

            }

        }
        return -1;
    }
    public static void main(String args[])
    {
        DetectLoop d = new DetectLoop();
        d.push(22);
        d.push(33);
        d.push(44);
        d.push(34);
        d.push(99);
      //  d.push(33);
       // d.push(24);
       // d.push(66);
        d.head.next.next.next.next = d.head;

        int b = d.detectLoop();

        boolean a = d.detectUsingHash();
        if(a ==  false )
        {
            System.out.print("Using hash, false");
        }
        else System.out.print("Using hash, true");
        if(b == -1)
        {
            System.out.print("No loop  " );
        }



    }

}
