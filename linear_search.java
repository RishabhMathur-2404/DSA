import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int i,n,item,c=0;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println("element to find ");
        item = sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i] == item)
            {
                c++;
                break;
            }
        }
        if(c>0)
        {
            System.out.println("item exist at " + i);
        }
        else
        {
            System.out.println("does not exist");
        }
    }
}
