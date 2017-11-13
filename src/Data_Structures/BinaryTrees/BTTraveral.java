package Data_Structures.BinaryTrees;

public class BTTraveral {

    static class Node{
        int data;
        Node right;
        Node left;
        Node(int num)
        {
            data = num;
            left= right= null;
        }
    }
    static class Binarytree
    {
        Node root;
        Binarytree(int key)
        {
            root = new Node(key);
        }
        Binarytree()
        {
            root = null;
        }
    }

    static void Inorder(Node node)
    {
        if(node == null)
            return;
        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);

    }
    static void Preorder(Node node)
    {
        if(node == null)
            return;
        System.out.print(node.data + " ");
        Inorder(node.left);
        Inorder(node.right);

    }
    static void PostOrder(Node node)
    {
        if(node == null)
            return ;

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String args[])
    {
        Binarytree T = new Binarytree();
        T.root = new Node(1);
        T.root.left = new Node(2);
        T.root.left.left= new Node(4);
        T.root.right = new Node(5);
        T.root.right.right = new Node(9);
        Inorder(T.root);
        System.out.println();
        Preorder(T.root);
        System.out.println();
        PostOrder(T.root);

        


    }

}
