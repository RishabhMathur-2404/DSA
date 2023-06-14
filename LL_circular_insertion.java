import java.util.Scanner;

public class LL_circular_insertion {
    static class Node{
        int data;
        LL_circular_creation.Node next;
        Node( int data ){
            this.data = data;
            this.next = next;
        }
    }
    LL_circular_creation.Node head = null;
    LL_circular_creation.Node tail = null;
    public void creation(){
        int data, n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter data:  ");
            data=sc.nextInt();
            LL_circular_creation.Node new_node = new LL_circular_creation.Node(data);
            if(head == null)
            {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            }
            else {
                System.out.println("enter 1 to insert in begining, 2 at end, 3 at position ");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                        break;
                    case 2:
                       tail.next = new_node;
                       tail = new_node;
                       new_node.next = head;
                        break;
                    case 3:
                        System.out.println("Enter node position to insert: ");
                        p = sc.nextInt();
                        LL_circular_creation.Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
            System.out.print("enter 1 to continoue ");
            n = sc.nextInt();
        }
        while (n == 1);
    }
    public void tranverser(){
        LL_circular_creation.Node temp = head;
        if(head == null) {
            System.out.println("not exist");
        }
        else {
            do{
                System.out.print( temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    public static void main(String[] args) {
        LL_circular_creation ll = new LL_circular_creation();
        ll.creation();
        ll.tranverser();
    }
}
