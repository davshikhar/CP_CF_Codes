package com.cp;

import java.util.Scanner;

public class OneandTwo
{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int t ,j=0,s=1,s1=1,l=0;

        t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int []a=new int[n];
            for(j=0;j<n;j++)
                a[j]=sc.nextInt();
            int k=0;
            for(j=1;j<=(n-1);j++){
                s=1;s1=1;
                for(k=0;k<j;k++)
                   s=s*a[k];
                for(k=j;k<n;k++)
                    s1=s1*a[k];
                if(s==s1) {
                    l=j;
                    break;
                }
            }
            if(l==0)
                System.out.println(""+(-1));
            else
                System.out.println(""+l);
            l=0;
        }

    }

}
