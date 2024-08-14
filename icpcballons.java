package com.cp;

import java.util.Scanner;

public class icpcballons {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int []a={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                int l=s1.indexOf(ch);
                a[l]+=1;
            }
            int sum=0;
            for(int i=0;i<26;i++){
                if(a[i]==0)
                    continue;
                else{
                    sum=(a[i]+1)+sum;
                }
            }
            System.out.println(sum);
        }
    }
}
