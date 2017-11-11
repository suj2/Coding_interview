package Data_Structures.SingleLL;



    public  class LinkedList{
    Node head;

     static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data =d;
            next = null;
        }
    }

    public void insert(Node prev, int num)
    {
        Node n = head;
        Node add = new Node(num);
        if(prev.next == null)
        {

            prev.next = add;
            add.next = null;
        }
        else{
        while(n!= prev)
        {
                Node temp = prev.next;
                prev.next = add;
                add.next = temp;
                n = n.next;

            }
        }
        }
        public int pop(int pos)
        {
            Node temp= head;
            Node prev = null;

            int count =0;
            if(temp!= null  && temp.data == pos)
            {
                head = temp.next ;
                return 1 ;
            }
            if(temp == null ) return -1;
            if(temp != null && temp.data != pos)
            {
                prev = temp;
                temp = temp.next;
            }

            prev.next = temp.next;
            return 0;



        }

        public  void printAll()
        {
            Node n = head;
            while(n!= null)
            {
                System.out.println(n.data);
                n = n.next;
            }

        }


    public static void main(String args[])

    {
        LinkedList ll = new LinkedList();
        ll.head  = new Node(34);
        Node second = new Node(32);
        Node third = new Node(22);
        third.next = null;
        ll.head.next = second;
        second.next = third;
        ll.insert(third,323);
        ll.printAll();
        ll.pop(3);
        ll.pop(2);
        System.out.println("new linked list is ");
        ll.printAll();



    }
}
