package com.cp;
import java.util.Scanner;
import java.util.*;

public class TalesOfSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0;
        while(t-->0){
            int n=sc.nextInt();
            ArrayList <Integer> arr = new ArrayList<>(n);
            for(i=0;i<n;i++){
                int j=sc.nextInt();
                arr.add(j);
            }
            int k=0;
            for(i=0;i<n-1;i++){
                if(arr.get(i) > arr.get(i+1)){
                    k=Math.max(k,arr.get(i));
                }
            }
            System.out.println(k);
        }
    }
}
