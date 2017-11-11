package Data_Structures.SingleLL;

public class PositionDeleteLL {
     Node head;
     public class Node{
         int data;
         Node next;
         Node (int d)
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

     void pop(int num)
     {
         if(head == null)
         {
             return;
         }
         Node n  = head;
         if(head.next.data == num)
         {
             head = n.next;
             return;
         }
         while(n.next.data != num)
         {
             n= n.next;
         }
          n.next = n.next.next;

     }

     void printAll()
     {
         Node temp = head;
         while(temp!= null )
         {
             System.out.println(temp.data + " ");
             temp = temp.next;
         }
     }

     public static void main(String args[])
     {
         PositionDeleteLL l = new PositionDeleteLL();
         l.push(32);
         l.push(11);
         l.push(14);
         l.push(78);
         l.push(90);
         l.printAll();
         l.pop(11);
         l.pop(32);
         l.printAll();
         System.out.println(" ");
         System.out.println(" ");
         l.pop(90);
         l.printAll();
     }
}
