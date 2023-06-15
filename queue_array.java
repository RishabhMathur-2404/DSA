import java.util.Scanner;

    class queue{
        int f = -1;
        int r = -1;
        int n = 10;
        int q[] = new int[n];
        void enqueue(){
            if(r == n-1)
            {
                System.out.println("overflow");
            }
            else {
                System.out.println("enter data ");
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                if(f == -1 && r == -1) {
                    f=0;
                    r=0;
                    q[r] = i;
                }
                else{
                    r = r+1;
                    q[r] = i;
                }
            }
        }
        void dequeue(){
            if(f == -1 && r == -1) {
                System.out.println("underflow");
            }
            else {
                f = f+1;
                System.out.println("item deleted");
            }
        }
        void display() {
            System.out.println("items are");
            for (int i = f; i <= r;i--)
            {
                System.out.println(q[i]);
            }
        }
    }
public class queue_array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            queue s = new queue();
            s.enqueue();
            s.dequeue();
            s.display();
        }
    }

