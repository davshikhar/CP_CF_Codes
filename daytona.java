package com.cp;

import java.util.Scanner;

public class daytona {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int s=-1;
            for(int i=0;i<n;i++){
                if(a[i]==k)
                    s=1;
            }
            if(s==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
