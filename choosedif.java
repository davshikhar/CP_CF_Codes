package com.cp;

import java.util.Scanner;
import java.util.Arrays;
public class choosedif
{
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int []a=new int[n];
            int []b=new int[m];
            int i=0,j=0;
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(j=0;j<m;j++)
                b[j]=sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            for(i=0;i<n;i++)
                System.out.println("a="+a[i]);
            for(i=0;i<m;i++)
                System.out.println("b="+b[i]);
            int l=k/2;
            int r=k/2;
            int s=0;
                for(i=0;i<l;i++){
                    // arr.add(a[i]);
                    s=s+a[i];
//                    System.out.println("s="+s);
                }
                for(j=0;j<r;j++){
                    // arr.add(b[j]);
                    s=s+b[j];
//                    System.out.println("s="+s);
                }
            System.out.println("s="+s);
            if(s==((k*(k+1))/2))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
