package algorithms.SearchingAlgorithms.DutchSorting;

public class DutchDll {

    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d)
        {
            data = d;
           // next = null;
        }


    }

    void push(int num)
    {
     Node n = new Node(num);


        n.next = head;
        n.prev = null;
        if(head!= null)
        {
            head.prev= n;

        }

     head = n;

    }

    void PrintaLL()
    {
        Node a = head;
        while(a!= null)
        {
            System.out.print(a.data  + "  ");
            a = a.next;

        }

    }
    void sort()
    {
        Node l  = head;
        while(l!= null)
        {
           /* if(l.data == 0  && l == head)
            {
                l = l.next;

            }*/
            if(l.data == 0 )
            {
System.out.println("true ");
                l.prev.next = l.next;
                l.next.prev = l.prev;
                l = l.next;
                push(0);


            }

         /*   if(l.data == 1)
            {
                l = l.next;
                continue;
            }*/
      /*      if(l.data == 2 )
            {
                endofList(2);

                l.prev.next = l.next;
                l = l.next;
                continue;
            }*/
        }


    }

    void endofList(int n)
    {
        Node c = head;
        Node var = new Node(n);
        while(c.next!= null)
        {
            c = c.next;
        }
        c.next = var;
        var.next = null;
        var.prev = c;

    }

    public static void main(String args[])
    {
        DutchDll d =  new DutchDll();
        d.push(2);
        d.push(1);
        d.push(0);
        d.push(2);
        d.push(0);
        d.push(2);
        d.push(1);
         d.sort();
        d.PrintaLL();

    }

}

