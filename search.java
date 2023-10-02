package com.cp;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        search obj =new search();
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] splitStr = str.split("\\s+");
        int[] a = new int[splitStr.length];
        for (int i = 0; i < splitStr.length; i++) {
            a[i] = Integer.parseInt(splitStr[i]);
        }
        int k=sc.nextInt();
        int v=obj.binarySearch(a,k);
        if(v>-1)
            System.out.println(v);
        else
            System.out.println(-1);
    }
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
