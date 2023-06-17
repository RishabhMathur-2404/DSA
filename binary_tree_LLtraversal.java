import java.util.Scanner;

public class binary_tree_LLtraversal {
    static Node create(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.print("enter value  ");
        int data = sc.nextInt();
        if(data == -1)
            return  null;
        root = new Node(data);
        System.out.print("enter left child of  " + root.data);
        root.left = create();
        System.out.print("enter right child of  " + root.data);
        root.right = create();
        return root;
    }

    static void inorder(Node root)
    {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    static void preorder(Node root)
    {
        if(root == null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root)
    {
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }


    public static void main(String[] args) {
        Node root = create();
        preorder(root);
        postorder(root);
        inorder(root);
    }
}
class Node{
    Node left,right;
    int data;
    public Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

