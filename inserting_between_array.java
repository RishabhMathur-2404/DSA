import java.util.Scanner;

public class inserting_between_array {
    public static void main(String[] args) {
        int n, m, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("no of elements  ");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("values  ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("index of new value");
        m = sc.nextInt();
        System.out.println("enter new value");
        p = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                b[i] = p;
            } else {
                b[i] = a[i - 1];
            }
        }
        System.out.println("print  ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(b[i]);
        }
    }
}
