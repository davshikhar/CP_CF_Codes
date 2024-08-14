package com.cp;

import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        s=s.toLowerCase();
        String l="abcdefghijklmnopqrstuvwxyz";
        int c=0;
        for(int i=0;i<26;i++){
            if(s.indexOf(l.charAt(i))!=-1)
                c++;
        }
        if(c==26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
