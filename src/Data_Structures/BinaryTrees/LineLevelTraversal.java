package Data_Structures.BinaryTrees;

public class LineLevelTraversal {

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
    static int height(Node n)
    {
        if(n == null)
            return 0;
        int l = height(n.left);
        int r = height(n.right);
        if(l<r)
            return r+1;
        else return l+1;

    }

    static void printLine(Node node, int level)
    {
        if(node == null)
            return;
        if(level == 1) {

            System.out.print(node.data + " ");

        }
        if(level >1) {
            printLine(node.left, level - 1);
            printLine(node.right, level - 1);
        }


    }
    static void LineTraversal(Node node)
    {
        if(node == null)
            return ;
        int h = height(node);
        for(int j = 0;j<=h ; j++)
        {
            printLine(node, j);
            System.out.println();
        }

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
                    LineTraversal(b.root);

                }
    }


