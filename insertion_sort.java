import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        int i, n, a[],j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of elements ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("enter elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (i = 1; i < n - 1; i++)
        {
            temp = a[i];
            j = i - 1;
            while (temp < a[j] && j > -1) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
    }
}
