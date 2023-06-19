import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int i, n, item, c = 0, end, beg, mid = 0;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("enter elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("element to find ");
        item = sc.nextInt();
        beg = 0;
        end = n-1;
        while(beg <= end)
        {
            mid = (beg + end)/2;
            if ( item == a[mid])
            {
                c++;
                break;
            }
            else if (item > a[mid])
            {
                beg = mid +1;
            }
            else if (item < a[mid])
            {
                end = mid -1;
            }
        }
        if(c>0)
        {
            System.out.print(" item at " + mid);
        }
        else
        {
            System.out.println("not found");
        }
    }
}
