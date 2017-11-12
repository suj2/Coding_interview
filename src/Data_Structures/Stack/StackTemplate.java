package Data_Structures.Stack;
import java.util.*;

public class StackTemplate {

    static Stack<Character> c = new Stack<>();
    static void reverse()
    {
        if(c.empty())
        {
            return;
        }
        if(c.size() > 0 )
        {
            char b = c.pop();
            insertend(b);
           // System.out.println(c.pop());
            reverse();



        }
    }
    static private void insertend(char a)
    {
        if(c.isEmpty())
        {
            c.push(a);

        }
        else
        {
            char b = c.pop();
            insertend(a);
            c.push(b);
        }
    }

    public static void main(String args[])
    {
        c.push('a');
        c.push('d');
        c.push('f');
        c.push('r');
        System.out.println(c);
        reverse();
     //   System.out.println(c);
    }

}
