//package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class csesincreaase {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0 , 0);
        long c=0;
        long c1=0;
        long dif;
        for(int i=0;i<n;i++){
            long j=sc.nextLong();
            dif=j-c;
            c=j;
            if(dif<0){
                c1=Math.abs(dif)+c1;
            }
//            System.out.println("dif="+dif+" c1="+c1);
        }
        System.out.println(c1);
    }
}
