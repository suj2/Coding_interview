package Data_Structures.BinaryTrees;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;

public class VerticalOrder {





    static class Node {
        int data;
        Node left;
        Node right;

        Node(int num) {
            data = num;
            left = right = null;
        }
    }


     static class BinaryTree {
        Node root;

       private  void getVerticalOrder(Node n, int h, TreeMap<Integer, Vector<Integer>> v)
        {
            if(n == null)
                return;
            Vector<Integer> a = v.get(h);
            if(a == null) {
                a = new Vector<>();
                a.add(n.data);
            }
            else a.add(n.data);
            v.put(h,a);
            getVerticalOrder(n.left,h-1,v);
            getVerticalOrder(n.right,h+1,v);


        }

        void VerticalOrder(Node n)
        {
            TreeMap<Integer,Vector<Integer>> v = new TreeMap<Integer, Vector<Integer>>();
            int hd = 0;
            getVerticalOrder(n,hd,v);

            for (Entry<Integer, Vector<Integer>> entry : v.entrySet())
            {
                System.out.println(entry.getValue());
            }
        }
        }


        public static void main(String args[]) {
            BinaryTree b = new BinaryTree();
            b.root = new Node(3);
            b.root.left = new Node(4);
            b.root.right = new Node(5);
            b.root.left.right = new Node(7);
            b.root.left.right.right = new Node(9);

            b.root.left.right.right.right = new Node(10);
            b.VerticalOrder(b.root);


        }
    }
