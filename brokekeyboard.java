package com.cp;
import java.util.Objects;
import java.util.Scanner;

public class brokekeyboard {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int l=s.length();
            String s1="";
            for(int i=0;i<l;i++){
                char ch=s.charAt(i);
                if(ch!='B' || ch!='b') {
                    if (i == 0)
                        s1 = s1 + s.charAt(0);
                }
                if(ch=='B'){

                }
            }
        }
    }
}
