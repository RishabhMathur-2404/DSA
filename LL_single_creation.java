import java.sql.SQLOutput;
import java.util.Scanner;

public class LL_single_creation {
    static class Node{
        int data;
        Node next;
        Node( int data ){
            this.data = data;
            this.next = next;
        }
    }
    Node head = null;
    public void creation(){
        int data, n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter data:  ");
            data=sc.nextInt();
            Node new_node = new Node(data);
            if(head == null)
            {
                head = new_node;
            }
            else {
                new_node.next = head;
                head = new_node;
            }
            System.out.print("enter 1 to continoue ");
            n = sc.nextInt();
        }
        while (n == 1);
    }
    public void tranverser(){
        Node temp = head;
        if(head == null) {
            System.out.println("not exist");
        }
        else {
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LL_single_creation ll = new LL_single_creation();
        ll.creation();
        ll.tranverser();
    }
}

