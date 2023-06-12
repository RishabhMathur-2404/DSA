/*  Search an Element in an array
    Given an integer array and another integer element. The task is to find if the given element is present in array or not.*/

import java.util.Scanner;

public class search_element_array {
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
