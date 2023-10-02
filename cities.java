package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class cities {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            ArrayList<Integer> x = new ArrayList<>(n+1);
            ArrayList<Integer> y = new ArrayList<>(n+1);
            for(int i=1;i<=n;i++){
                x.add(sc.nextInt());
                y.add(sc.nextInt());
            }
            long min_cost = ((long)Math.abs(x.get(a-1)-x.get(b-1))+(long)Math.abs(y.get(a-1)-y.get(b-1)));
            long minimum_x = Long.MAX_VALUE/2;
            long minimum_y = Long.MAX_VALUE/2;
            for(int i=1;i<=k;i++){
                minimum_x=Math.min(minimum_x , ((long)Math.abs(x.get(a-1)-x.get(i-1))+(long)Math.abs(y.get(a-1)-y.get(i-1))));
                minimum_y=Math.min(minimum_y , ((long)Math.abs(x.get(b-1)-x.get(i-1))+(long)Math.abs(y.get(b-1)-y.get(i-1))));
            }
            min_cost = Math.min(min_cost , (minimum_x+minimum_y));
            System.out.println(min_cost);
        }
    }
}
