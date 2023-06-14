import java.util.Scanner;

public class LL_circular_deletion {
    static class Node{
        int data;
        LL_circular_deletion.Node next;
        Node( int data ){
            this.data = data;
            this.next = next;
        }
    }
    LL_circular_deletion.Node head = null;
    LL_circular_deletion.Node tail = null;
    public void creation(){
        int data, n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter data:  ");
            data=sc.nextInt();
            LL_circular_deletion.Node new_node = new LL_circular_deletion.Node(data);
            if(head == null)
            {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            }
            else {
                System.out.println("enter 1 to delete in begining, 2 at end, 3 at position ");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        tail.next = head;
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while(ptr.next != head)
                        {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = head;
                        tail = temp1;
                        break;
                    case 3:
                        System.out.println("Enter node position to insert: ");
                        p = sc.nextInt();
                        LL_circular_deletion.Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0; i < (p - 1); i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                }
            }
            System.out.print("enter 1 to continoue ");
            n = sc.nextInt();
        }
        while (n == 1);
    }
    public void tranverser(){
        LL_circular_deletion.Node temp = head;
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
        LL_circular_deletion ll = new LL_circular_deletion();
        ll.creation();
        ll.tranverser();
    }
}
