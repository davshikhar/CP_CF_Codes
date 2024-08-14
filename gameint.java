package com.cp;

import java.util.Scanner;

public class gameint {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=n%3;
            if(k==1||k==2)
                System.out.println("First");
            else
                System.out.println("Second");
        }
    }
}
