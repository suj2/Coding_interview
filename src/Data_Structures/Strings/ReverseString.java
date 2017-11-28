package Data_Structures.Strings;

import java.util.LinkedHashSet;

public class ReverseString {

    static void reverse(String s)
    {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(int i = 0; i <s.length();i++)
        {
            hs.add(s.charAt(i));
        }
        for( Character c:hs)
        System.out.print(c);
    }

    public static void main(String args[])
    {
        String s = new String("Sujata Sharma");
        reverse(s);
    }
}
