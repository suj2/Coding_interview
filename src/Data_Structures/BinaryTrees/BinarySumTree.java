package Data_Structures.BinaryTrees;

public class BinarySumTree {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int b)
        {
            data = b;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree(int n) {
            root.data = n;
        }

        BinaryTree() {
        }
    }

     static int BinarySumTree(Node n)
    {
        if(n == null)
            return 0;
        int old = n.data;
        n.data = BinarySumTree(n.left)+BinarySumTree(n.right);
        return old+n.data;


    }

    static void Inorder(Node n)
    {
        if(n == null)
            return;
        Inorder(n.left);
        System.out.print(n.data+ " ");
        Inorder(n.right);
    }
    public static void main(String args[])
    {
        BinaryTree b = new BinaryTree();
        b.root = new Node(3);
        b.root.left = new Node(2);
        b.root.right = new Node(3);
        b.root.left.right = new Node(4);
        b.root.right.left = new Node(5);
        b.root.left.left  = new Node (5);
        b.root.right.right = new Node(7);
        BinarySumTree(b.root);
        Inorder(b.root);


    }
}
