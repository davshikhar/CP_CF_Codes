package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class greengolddog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<Integer>(n);
            ArrayList<Integer> b=new ArrayList<Integer>(n);
            for(int i=0;i<n;i++){
                a.add(sc.nextInt());
                b.add(i);
            }
            ArrayList<Integer> c=new ArrayList<Integer>(n);
            Collections.sort(a);
            Collections.sort(b);
            Collections.reverse(a);
            Collections.reverse(b);
            for(int j=0;j<n;j++){
                c.add(b.get(j),j+1);
            }
            for(int i=0;i<n;i++)
                System.out.print(c.get(i)+" ");
            System.out.println();
        }
    }
}
