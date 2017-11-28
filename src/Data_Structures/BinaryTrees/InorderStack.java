package Data_Structures.BinaryTrees;
import java.util.Stack;

public class InorderStack {

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

        static void traverse(Node n) {
            Stack<Node> s = new Stack<Node>();
            if (n == null)
                return;
            Node current = n;
            while (current != null) {
                s.push(current);
                current = current.left;
            }
            while (s.size() > 0) {
                current = s.pop();
                System.out.print(current.data + " ");
                if (current.right != null) {
                    current = current.right;

                    while (current != null) {
                        s.push(current);
                        current = current.left;

                    }
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
            b.traverse(b.root);

        }
    }
}
