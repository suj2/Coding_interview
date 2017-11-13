package Data_Structures.BinaryTrees;

public class BFS {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int n) {
            data = n;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree(int n) {
            root = new Node(n);
        }

        BinaryTree() {
            root = null;
        }

    }

    static void BFStravel(Node node) {
        if (node == null)
            return;
        int h = height(node);
        for (int i = 0; i <= h; i++) {
            printLevel(node, i);
        }

    }

    static void printLevel(Node node, int l) {
        if (node == null)
            return;
        if (l == 1)
            System.out.println(node.data + " ");
        else {
            if(l > 1) {
                printLevel(node.left, l - 1);
                printLevel(node.right, l - 1);
            }
        }

    }

    static int height(Node node) {
        if (node == null)
            return 0;
        else {
            int l = height(node.left);
            int r = height(node.right);
            if (l > r) {
                return l+1;
            } else return r+1;
        }
    }
    public static void main(String args[]) {
        BinaryTree b = new BinaryTree();
        b.root = new Node(1);
        b.root.left = new Node(2);
        b.root.right = new Node(3);
        b.root.left.left = new Node(4);
        b.root.left.right = new Node(5);
        BFStravel(b.root);



}
}