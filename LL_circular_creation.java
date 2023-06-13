import java.util.Scanner;

public class LL_circular_creation {
    static class Node{
        int data;
       Node next;
        Node( int data ){
            this.data = data;
            this.next = next;
        }
    }
    Node head = null;
    Node tail = null;
    public void creation(){
        int data, n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter data:  ");
            data=sc.nextInt();
         Node new_node = new LL_circular_creation.Node(data);
            if(head == null)
            {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            }
            else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
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
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while(temp != head);
        }
    }

    public static void main(String[] args) {
        LL_circular_creation ll = new LL_circular_creation();
        ll.creation();
        ll.tranverser();
    }
}
