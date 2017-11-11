package Data_Structures.SingleLL;

public class MiddleLL {

    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void printAll()
    {
        Node n = head;
        while(n!= null)
        {
            System.out.println(n.data + "  ");
            n = n.next;
        }
    }
    void push(int num)
    {
        Node n = new Node(num);
        n.next = head;
        head = n;
    }

    int  pointersWay()
    {
        Node fast = head, slow = head;
        while(fast.next!= null && fast.next.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;



    }

    int odd()
    {
        int count = 0;

        Node n = head;
        Node b = head;
        if(n == null) return -1;
        while(n != null )
        {
            if( count %2 ==1 )
            {
                b = b.next;
            }
            n = n.next;

        }
        return b.data;

    }

    int middleElement()
    {
        if(head == null)
            return -1;
        Node n = head ;
        int count = 0;
        while(n.next != null){
            count++;
            n = n.next;
        }
        int c = count/2;
        System.out.println(c);
        n = head;
        while(c > 0)
        {
            n = n.next;
            c--;
        }
      //  System.out.println("the numner in middle is "+ n.data);

        return n.data;
    }

    public static void main(String args[])
    {
        MiddleLL l = new MiddleLL();
        l.push(43);
        l.push(765);
          l.push(22);
        l.push(89);
          l.push(32);
          l.push(22);
        l.printAll();
        System.out.println("middle element is " + l.middleElement());
        System.out.println("Using the fast pointer " + l.pointersWay());
        System.out.println("Using odd number" + l.odd());
    }


}
