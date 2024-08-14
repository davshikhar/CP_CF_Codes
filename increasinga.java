//package com.cp;

import java.util.Scanner;

public class increasinga {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        long n;
        long answer=0;
        n=sc.nextLong();
        long [] ar = new long[(int) n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextLong();
        }
        for(int i=1;i<n;i++){
            if(ar[i]<ar[i-1]){
                answer=answer+(ar[i-1]=ar[i]);
                ar[i] = ar[i-1];
            }
        }
        System.out.println(answer);
    }
}
