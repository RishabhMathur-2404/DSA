import java.util.Scanner;

public class Array2_d {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("no of Rows  ");
        n = sc.nextInt();

        System.out.print("no of Columns  ");
        m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.print("enter values  ");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++)
            {
                if(a[i][j]%10 == 2 )
                {
                    System.out.println(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
