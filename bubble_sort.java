import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        int i, n, a[], ptr, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of elements ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("enter elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (i = 0; i < n - 1; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                if (a[k] > a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println("sorted " + a[i]);
        }
    }
}
