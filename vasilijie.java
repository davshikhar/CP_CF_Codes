package com.cp;

import java.util.Scanner;

public class vasilijie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long x=sc.nextLong();
            long k=sc.nextLong();
            if(2*k>=x*(x+1) && 2*k<=n*(n+1)-(n-x)*(n-x+1)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
