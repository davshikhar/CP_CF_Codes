package com.cp;

import java.util.Scanner;
//1476A
public class KdivisibleSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long k=sc.nextInt();
            System.out.println(((((n+k-1)/k)*k)+n-1)/n);
        }
    }
}
