import java.util.Scanner;

public class LL_deletion {
    static class Node{
        int data;
        LL_single_creation.Node next;
        Node( int data ){
            this.data = data;
            this.next = next;
        }
    }
    LL_single_creation.Node head = null;
    public void creation(){
        int data, n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter data:  ");
            data=sc.nextInt();
            LL_single_creation.Node new_node = new LL_single_creation.Node(data);
            if(head == null)
            {
                head = new_node;
            }
            else {
                System.out.println("enter 1 to delete in begining, 2 at end, 3 at position ");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        LL_single_creation.Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;
                    case 2:
                        LL_single_creation.Node temp1 = head;
                        LL_single_creation.Node ptr = temp1.next;
                        while(ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;
                    case 3:
                        System.out.println("Enter node position to delete: ");
                        p = sc.nextInt();
                        LL_single_creation.Node temp2 = head;
                        LL_single_creation.Node ptr1 = temp2.next;
                        for (int i = 0; i < (p - 2); i++) {
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
        LL_single_creation.Node temp = head;
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
        LL_deletion ll = new LL_deletion();
        ll.creation();
        ll.tranverser();
    }
}

