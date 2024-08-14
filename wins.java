package com.cp;

import java.util.Scanner;
public class wins {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(s.charAt(s.length()-1));

        }
    }
}
