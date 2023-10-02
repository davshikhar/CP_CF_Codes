package com.cp;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        int i;long sum=0;
        for(i=0;i<(n-1);i++){
            long j=sc.nextInt();
            sum=sum+j;
        }
        System.out.println((((n*(n+1)))/2)-sum);
    }
}
