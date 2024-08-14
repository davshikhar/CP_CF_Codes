package com.cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class circles {
    public static void main(String[] args) {
        solve();
    }
    static double distance(int x1 , int x2 , int y1 , int y2){
        return (Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int px=sc.nextInt(),py=sc.nextInt(),ax=sc.nextInt(),ay=sc.nextInt(),bx=sc.nextInt(),by=sc.nextInt();
            double pa = distance(px,py,ax,ay);
            double pb = distance(px,py,bx,by);
            double oa = distance(0,0,ax,ay);
            double ob = distance(0,0,bx,by);
            double ab = distance(ax,ay,bx,by);
            double answer = Double.MAX_VALUE;
            ArrayList<Double>arr = new ArrayList<>(Arrays.asList(ab/2,pa,ob));
            ArrayList<Double>arr1 = new ArrayList<>(Arrays.asList(ab/2,pb,oa));
            answer = Math.min(answer , Math.max(pa , oa));
            answer = Math.min(answer , Math.max(pb , ob));
            answer = Math.min(answer , Collections.max(arr));
            answer = Math.min(answer , Collections.max(arr1));
            System.out.printf("%.5f",answer);
        }
    }
}
