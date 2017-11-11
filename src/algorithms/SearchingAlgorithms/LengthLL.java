package algorithms.SearchingAlgorithms;

public class LengthLL {
    Node head ;
    class Node {
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
        n.next = head;
        head = n;
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

 int count = 0;
int recursivell(Node a)
{
    if(a == null)
        return 0 ;


    return 1+ recursivell(a.next);

}


 int count()
    {
        Node n = head;
        int count = 0;
        while(n!= null)
        {
            count++;
            n = n.next;
        }
        return count;
    }


    public static void main(String args[])
    {
        LengthLL ll = new LengthLL();
        ll.push(32);
        ll.push(22);
        ll.push(54);
        ll.push(11);
        ll.printAll();
        System.out.println("count is " + ll.count());
        System.out.println("recursive print "  + ll.recursivell(ll.head));

    }
}
