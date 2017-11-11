package Data_Structures.SingleLL;

import java.util.HashSet;

public class DuplicateLLUnsorted {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }

    }
    void push(int n)
    {
        Node a = new Node(n);
        a.next = head;
        head = a;
    }
    void unsortedList(Node n ) {
        Node s = head;
        Node prev = null;
        HashSet<Integer> h = new HashSet<>();
        while (n != null) {


            if (h.contains(n.data)) {
                prev.next = n.next;

            }
            h.add(n.data);
            prev = n.next;
            n = n.next;

        }

         /*   for (int var : h) {
                System.out.print(var + "  ");
            }
            System.out.println();
*/
      //  PrintAll();


        while (s != null) {
        System.out.println(s.data);
        s = s.next;
        }
    }
    void PrintAll()
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        DuplicateLLUnsorted dd = new DuplicateLLUnsorted();
        dd.push(23);
        dd.push(13);
        dd.push(45);
        dd.push(89);
        dd.push(13);
        dd.push(45);
        dd.PrintAll();

       dd.unsortedList(head);
     //   dd.PrintAll();

    }
}
