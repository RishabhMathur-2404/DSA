import java.sql.SQLOutput;
import java.util.Scanner;

public class Array1_d {
   /* public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("no of elements  ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("values  ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("print  ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
    }*/




   /* ----------------------------------------------------------------------------------------------
    inserting between array*/

  /* public static void main(String[] args) {
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
   }*/
/* ----------------------------------------------------------------------------------------------
    deleting from array*/

    /*public static void main(String[] args) {
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
    }*/

    /* ----------------------------------------------------------------------------------------------
    2D-array*/

    /*public static void main(String[] args) {
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
    }*/



  /*  Search an Element in an array
    Given an integer array and another integer element. The task is to find if the given element is present in array or not.*/

    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("no of elements  ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("values  ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("element to search ");
        m = sc.nextInt();
        System.out.println("print  ");
        for(int i=0;i<n;i++)
        {
            if(a[i] == m){
            System.out.print("index: " + i );
        }

        }
    }
}

