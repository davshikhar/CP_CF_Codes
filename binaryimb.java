package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class binaryimb {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();String s=sc.next();
            char ch;int c=0;int c1=0;
            for(int i=0;i<n;i++){
                ch=s.charAt(i);
                if(ch=='0')
                    c++;
                else
                    c1++;
                s=s+ch;
            }
            if(c==n || s.contains("10"))
                System.out.println("YES");

            else
                System.out.println("NO");
        }
    }
}
