import java.util.Scanner;

public class deleting_from_array {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("no of elements  ");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("values  ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("index to delete");
        m = sc.nextInt();
        for (int i = 0; i <a.length; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                continue;
            } else {
                b[i-1] = a[i];
            }
        }
        System.out.println("print  ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i]);
        }
    }
}
