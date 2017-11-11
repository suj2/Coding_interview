package Data_Structures.SingleLL;



public class SwappLL {
    Node head ;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

        void push(int num) {
            Node a = new Node(num);
            a.next = head;
            head = a;
        }

    void printAll()
    {
        Node n = head ;
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    void swap(int x, int y)
    {
        if(x == y )
            return;

        Node prevX = null, curX = head;
        while(curX != null && (curX.data != x))
        {
            prevX = curX;
            curX = curX.next;

        }

        Node prevY = null, curY = head;
        while(curY != null && curY.data != y)
        {
            prevY = curY;
            curY = curY.next;
        }

        if(curX == null || curY == null)
            return ;
        if(prevX!= null)
        {
             prevX.next = curY;
        }
        else head = curY;

        if(prevY != null)
        {
            prevY.next = curX;
        }
        else head = curX;

        Node temp = curY.next;
        curY.next = curX.next;
        curX.next = temp;

    }

        public static void main(String args[])
        {
              SwappLL c = new SwappLL();

              c.push(32);
              c.push(45);
              c.push(33);
              c.push(90);
              c.push(88);
              c.push(77);
            c.printAll();
              c.swap(32,32);
              System.out.println("After swapping");
              c.printAll();

        }



}
