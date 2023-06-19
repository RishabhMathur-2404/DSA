import java.util.Scanner;

public class selection_sorting {
    public static void main(String[] args) {
        int i, n, a[], loc, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of elements ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("enter elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (i = 0; i < n - 1; i++) {
            loc = i;
            for(int j=i+1; j<n; j++)
            {
                if( a[j] < a[loc])
                {
                    loc = j;
                }
            }
            temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(" " + a[i]);
        }
    }
}
