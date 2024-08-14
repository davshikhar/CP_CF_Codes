package com.cp;

import java.util.Scanner;

public class points {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            long n=sc.nextLong();
            long l = -1;
            long r = (long)1e9;
            while(r-l>1){
                long mid = (l+r)/2;
                if(mid * mid >=n){
                    r= mid;
                }
                else
                    l=mid;
            }
            System.out.println(r-1);
        }
    }
}
