package com.cp;

//problem 1858C

import java.util.ArrayList;
import java.util.Scanner;

public class YetAnotherPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            for(int i=1;i<=n;i=i+2){
                for(int j=i;j<=n;j=j*2){
                    arr.add(j);
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr.get(i)+" ");
                if(i==n-1)
                    break;
            }
            System.out.println();
        }
    }
}