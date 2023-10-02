package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class chips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> a =new ArrayList<>(n);
            ArrayList<Integer> b =new ArrayList<>(n);
            for(int i=0;i<n;i++)
                a.add(sc.nextInt());
            for(int i=0;i<n;i++)
                b.add(sc.nextInt());
            long ma = Collections.min(a);
            long mb = Collections.min(b);
            long s1=0;
            long s2=0;
            for(int i=0;i<n;i++){
                s1 = s1+a.get(i);
                s2= s2+b.get(i);
            }
            long ans = Math.min(ma*n + s1 , mb*n + s2);
            System.out.println(ans);
        }
    }
}
