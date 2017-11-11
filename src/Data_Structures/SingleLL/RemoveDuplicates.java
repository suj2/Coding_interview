package Data_Structures.SingleLL;

public class RemoveDuplicates {

    Node head;
    static class Node{
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

    void removeDuplicates()
    {
        Node n = head;
       Node next= null;
        if(head == null)
            return ;
        while(n.next !=null)
        {
            if (n.data == n.next.data)
            {
                n.next = n.next.next;
             //   n.next = null;
          //      n.next = next;
            }
            else
            n = n.next;
        }

    }
    void PrintAll()
    {
        Node n = head;
        while(n!=null) {
            System.out.println(n.data + " ");

            n = n.next;
        }
    }
    public static void main(String args[])
    {
        RemoveDuplicates rm = new RemoveDuplicates();
        rm.push(32);
        rm.push(32);
        rm.push(23);
        rm.push(12);
        rm.push(12);
        rm.push(12);
        rm.push(12);;
        rm.removeDuplicates();
        rm.PrintAll();

    }
}
