package com.cp;
import java.util.Arrays;
import java.util.Scanner;

public class threadlet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            long [] arr = new long[3];
            for(int i=0;i<3;i++)
                arr[i]=sc.nextLong();
            Arrays.sort(arr);
            long a=arr[0];
            long b=arr[1];
            long c=arr[2];
            if(a==b&&b==c)
                System.out.println("YES");
            else if(b%a!=0 || c%a!=0)
                System.out.println("NO");
            else if(b%a==0 && c%a==0){
                long x=b/a;
                long y=c/a;
                if((x-1)+(y-1) <= 3){
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
        }
    }
}
