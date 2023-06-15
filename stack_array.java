import java.util.Scanner;

class stack{
    int top = -1;
    int n = 10;
    int a[] = new int[n];
    void push(){
        Scanner sc = new Scanner(System.in);
        int i;
        if(top == (n-1))
        {
            System.out.println("overflow");
        }
        else {
            System.out.println("enter data ");
            i = sc.nextInt();
            top = top + 1;
            a[top] = i;
            System.out.println("item inserted");
        }
    }
    void pop(){
        if(top == -1) {
            System.out.println("underflow");
        }
        else {
            top = top - 1;
            System.out.println("item deleted");
        }
    }
    void display() {
        System.out.println("items are");
        for (int j = top;j>= 0;j--) {
            System.out.println(a[j]);
        }
    }
}
public class stack_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        s.push();
        s.pop();
        s.display();
    }
}
