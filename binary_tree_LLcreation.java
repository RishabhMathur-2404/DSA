import java.util.Scanner;

public class binary_tree_LLcreation {
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


    public static void main(String[] args) {
        Node root = create();
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
