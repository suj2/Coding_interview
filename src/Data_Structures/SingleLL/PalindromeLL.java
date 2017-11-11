package Data_Structures.SingleLL;

public class PalindromeLL {
    Node head ;
    Node left;
    static class Node {
        String data;
        Node next;
        Node(String d)
        {
            data = d;
            next = null;
        }

    }
    void push(String num)
    {
        Node n = new Node(num);
        n.next= head;
        head = n;
    }

    boolean palindromeTest(Node right)
    {
        left = head;
        if(right == null)
            return true;

      boolean b =  palindromeTest(right.next);
      if (b== false) return false;
       boolean check = (left.data.equals(right.data));

       return check;


    }

    public static void main(String args[])
    {
        PalindromeLL d = new PalindromeLL();
        d.push("a");
        d.push("v");
        d.push("e");
        d.push("r");
        d.push("e");
        d.push("v");
        d.push("a");
     //d.push();

        boolean b = d.palindromeTest(d.head);
        if(b == true)
        {
            System.out.println("is a palindrome");
        }
        else         System.out.println("is not a palindrome");




}

}
