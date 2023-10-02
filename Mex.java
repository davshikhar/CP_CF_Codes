package com.cp;

import java.util.Scanner;

public class Mex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            if(k>n){
                System.out.println(-1);
            }
            else if(k>x+1){
                System.out.println(-1);
            }
            else{
                long s = (long) k *(k-1)/2;
                n=n-k;
                s=s+ (long) (k == x ? x - 1 : x) *n;
                System.out.println(s);
            }
        }
    }
}
