package algorithms.SearchingAlgorithms;

public class SearchLL {
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data = data;
        }
    }

    void push(int num)
    {
        Node a = new Node(num);
        a.next = head;
        head = a;
    }

    boolean search(int a)
    {
        Node n = head;
        while(n != null)
        {
            if(n.data == a)
                return true;
             n = n.next;

        }
        return false;

    }
    void printAll()
    {
        Node n = head ;
        while(n != null)
        {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    boolean recurSearch(Node a, int num)
    {
        Node n = a;
        if(n == null)
            return false;
        if(n.data == num)
            return true;
        else
            return recurSearch(a.next, num);

    }

    public static void main(String args[])
    {
        SearchLL ll = new SearchLL();
        ll.push(32);
        ll.push(78);
        ll.push(77);
        ll.push(776);
        ll.push(66);
        System.out.println("Search for 32 "  + ll.search(32));
        System.out.println("Search for 77 " + ll.search(77));
        System.out.println("Search for 78"  + ll.search(78));
        System.out.println("Search for 62 "  + ll.search(62));
        System.out.println("Search for 66 "  + ll.recurSearch(ll.head,66));
        ll.printAll();

    }
}
