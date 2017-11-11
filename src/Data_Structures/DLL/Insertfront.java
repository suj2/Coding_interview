package Data_Structures.DLL;

public class Insertfront {
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node (int num)
        {
            data = num;

        }
    }
    
    void push(int num)
    {
        Node n = new Node(num);
        n.next = head;
        n.prev = null;
        if(head!=null)
                head.prev = n;
        head = n;

    }


    void printAll() {
        Node n = head;
        Node back = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

        while (back.next != null) {
            back = back.next;
        }
        System.out.println();

       while(back != null)
        {
            System.out.print(back.data + " ");
            back = back.prev;
        }
    }



    void pushAfterNode(Node prev, int num)
    {

        Node n = new Node(num);


        n.next = prev.next;
        prev.next = n;
        n.prev = prev;
        if(n.next != null)
        {
            n.next.prev = n;
        }


    }

    void addAtEnd(Node n, int num)
    {
        Node a = head;
        Node var = new Node(num);
        n.next = var;
        var.prev = n;
        var.next = null;

    }

    void beforeEnd(Node a, int num)
    {
        Node n = new Node(num);
        n.next = a;
        n.prev.next = n;
        n.prev = n;
    }
    public static void main(String args[])
    {
        Insertfront I = new Insertfront();
        I.push(43); 
        I.push(12);
        I.push(45); 
        I.push(44); 
        I.push(12); 
        I.push(47);
        I.printAll();
        I.pushAfterNode(I.head.next.next, 89);
        I.printAll();
        I.addAtEnd(I.head.next.next.next.next.next, 14);
        I.printAll();
        I.beforeEnd(I.head.next.next.next, 22);
        I.printAll();
        
    }
    
  
}
