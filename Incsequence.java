package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Incsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            ArrayList<Integer> b = new ArrayList<>(n);
            int c=1;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==c){
                    c++;
                }
                b.add(c);
                c++;
            }
            System.out.println(Collections.max(b));
        }
    }
}
