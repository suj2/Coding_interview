package algorithms.SearchingAlgorithms;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.Scanner;

public class CharacterAppend {


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n>0)

        {
            n--;
            String a = in.next();
            String b = in.next();
            String concat = "";
            HashMap<Character, Integer> map = new HashMap<Character, Integer> ();
            for(char c :b.toCharArray()) {
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else
                    map.put(c, map.get(c) + 1);
            }
            System.out.println(map);

            for(char c :a.toCharArray())
            {
                if (map.get(c) != null)
                {
                    continue;}
                else
                    concat += c;
            }
            map.clear();
            for(char c :a.toCharArray()) {
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else
                    map.put(c, map.get(c) + 1);
            }
            System.out.println(map);

            for(char c :b.toCharArray())
            {
                if (map.get(c) != null)
                {
                    continue;}
                else
                    concat += c;
            }



            in.close();
            System.out.println(concat.length() == 0 ? "-1" : concat);
            }
            //   HashSet<Char> h = new HashSet<Char>();


        }


    }

